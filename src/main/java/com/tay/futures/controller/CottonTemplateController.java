package com.tay.futures.controller;


import com.google.common.collect.Lists;
import com.tay.futures.constants.RangeStrategyType;
import com.tay.futures.entity.CottonTemplate;
import com.tay.futures.entity.PageBean;
import com.tay.futures.entity.RangeStrategy;
import com.tay.futures.entity.User;
import com.tay.futures.service.CottonTemplateService;
import com.tay.futures.service.RangeStrategyService;
import com.tay.futures.util.JsonResponse;
import com.tay.futures.util.ResponseUtil;
import com.tay.futures.vo.RangeStrategyVo;
import com.tay.futures.vo.TemplateVo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/template")
public class CottonTemplateController {
    private static final Logger log = LoggerFactory.getLogger(CottonTemplateController.class);// 日志文件

    @Autowired
    private CottonTemplateService cottonTemplateService;

    @Autowired
    private RangeStrategyService rangeStrategyService;




    @RequestMapping("/listAll")
    public String listAll(HttpServletRequest request,
            @RequestParam(value = "page", required = false) String page,
            @RequestParam(value = "rows", required = false) String rows,
            CottonTemplate cottonTemplate, HttpServletResponse response) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        if (page != null && rows != null) {
            PageBean pageBean = new PageBean(Integer.parseInt(page),
                    Integer.parseInt(rows));
            map.put("start", pageBean.getStart());
            map.put("size", pageBean.getPageSize());
        }
        List<CottonTemplate> templateList = null;
        HttpSession session = request.getSession();
        User currentUser=(User)session.getAttribute("currentUser");
        List<CottonTemplate> cottonTemplates=cottonTemplateService.getAllCottonTemplateByUid(currentUser.getId());
        JSONObject result = new JSONObject();
        JSONArray jsonArray = JSONArray.fromObject(cottonTemplates);
        result.put("rows", jsonArray);
        result.put("total", cottonTemplates.size());
        ResponseUtil.write(response, result);
        log.info("request: template/listAll , map: " + map.toString());
        return null;
    }








    /**
     * 添加或修改模板
     *
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    public String save(TemplateVo templateVo, HttpServletResponse response,HttpServletRequest request) throws Exception {
        Long templateId = 0L;

        CottonTemplate cottonTemplate=new CottonTemplate();
        cottonTemplate.setName(templateVo.getName());
        HttpSession session = request.getSession();
        User currentUser=(User)session.getAttribute("currentUser");
        cottonTemplate.setCreatorId(currentUser.getId().longValue());
        List<RangeStrategy> rangeStrategyList=new ArrayList<>();
        for(RangeStrategyVo rangeStrategyVo:templateVo.getRangeStrategyVoList()){
            //过滤无效值
            if(rangeStrategyVo.getMin() ==null  || rangeStrategyVo.getMax() ==null ||rangeStrategyVo.getPrice() ==null){
                log.warn("rangeStrangeVo invalid: {}",rangeStrategyVo);
                continue;
            }
            RangeStrategy rangeStrategy=new RangeStrategy();
            BeanUtils.copyProperties(rangeStrategyVo,rangeStrategy);
            rangeStrategyList.add(rangeStrategy);
        }
        templateId=cottonTemplateService.addTemplateAndStrategy(cottonTemplate,rangeStrategyList);
        JSONObject result = new JSONObject();
        if (templateId > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        log.info("request: template/save , template: " + templateVo.toString());
        ResponseUtil.write(response, result);
        return null;
    }



    @RequestMapping("/update")
    public String update(TemplateVo templateVo, HttpServletResponse response,HttpServletRequest request) throws Exception {

        CottonTemplate cottonTemplate=new CottonTemplate();
        cottonTemplate.setName(templateVo.getName());
        cottonTemplate.setId(templateVo.getId());
        cottonTemplateService.updateTemplate(cottonTemplate);
        List<RangeStrategy> rangeStrategyList=new ArrayList<>();
        for(RangeStrategyVo rangeStrategyVo:templateVo.getRangeStrategyVoList()){
            //过滤无效值
            if(rangeStrategyVo.getMin() ==null  || rangeStrategyVo.getMax() ==null ||rangeStrategyVo.getPrice() ==null){
                log.warn("rangeStrangeVo invalid: {}",rangeStrategyVo);
                continue;
            }
            RangeStrategy rangeStrategy=new RangeStrategy();
            BeanUtils.copyProperties(rangeStrategyVo,rangeStrategy);
            rangeStrategy.setTemplateId(templateVo.getId());
            rangeStrategyList.add(rangeStrategy);
        }
        if(CollectionUtils.isNotEmpty(rangeStrategyList)){
            rangeStrategyService.deleteRangeStrategyByTemplateId(templateVo.getId());
            rangeStrategyService.addRangeStrategyList(rangeStrategyList);
        }

        log.info("request: template/update , template: " + templateVo.toString());
        ResponseUtil.write(response, "修改成功");
        return null;
    }


    @RequestMapping("/show")
    public String cottonPriceCompute(@RequestParam(value = "id", required = false) Long  id,
                                     Model model) throws Exception {
        log.info("request: template/show  ");
        CottonTemplate cottonTemplate=cottonTemplateService.getCottonTemplateById(id);
        if(cottonTemplate == null){
            log.warn("template id:{}  is null",id);
            return JsonResponse.badResult("template is null");
        }
        List<RangeStrategy> rangeStrategies = rangeStrategyService.getStrategyByTemplateId(cottonTemplate.getId());
        Collections.sort(rangeStrategies);

        List<RangeStrategy> lengthStrategies= Lists.newArrayList();
        List<RangeStrategy> micronaireStrategies= Lists.newArrayList();
        List<RangeStrategy> evennessStrategies= Lists.newArrayList();
        List<RangeStrategy> strengthStrategies= Lists.newArrayList();
        List<RangeStrategy> miscellaneousStrategies= Lists.newArrayList();
        for(RangeStrategy rangeStrategy:rangeStrategies){
            if(RangeStrategyType.LENGTH.getCode().equals(rangeStrategy.getType().intValue())){
                lengthStrategies.add(rangeStrategy);
            }else if(RangeStrategyType.MICRONAIRE.getCode().equals(rangeStrategy.getType().intValue())){
                micronaireStrategies.add(rangeStrategy);
            }else if(RangeStrategyType.EVENNESS.getCode().equals(rangeStrategy.getType().intValue())){
                evennessStrategies.add(rangeStrategy);
            }else if(RangeStrategyType.STRENGTH.getCode().equals(rangeStrategy.getType().intValue())){
                strengthStrategies.add(rangeStrategy);
            }else if(RangeStrategyType.MISCELLANEOUS.getCode().equals(rangeStrategy.getType().intValue())){
                miscellaneousStrategies.add(rangeStrategy);
            }


        }

        model.addAttribute("name",cottonTemplate.getName());
        model.addAttribute("id",id);
        model.addAttribute("lengthStrategies",lengthStrategies);
        model.addAttribute("micronaireStrategies",micronaireStrategies);
        model.addAttribute("evennessStrategies",evennessStrategies);
        model.addAttribute("strengthStrategies",strengthStrategies);
        model.addAttribute("miscellaneousStrategies",miscellaneousStrategies);
        return "templateinfo";
    }


    /**
     * 删除模板
     *
     * @param ids
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "ids") String ids, HttpServletResponse response) throws Exception {
        JSONObject result = new JSONObject();
        String[] idsStr = ids.split(",");

        for (int i = 0; i < idsStr.length; i++) {
            cottonTemplateService.deleteById(Long.valueOf(idsStr[i]));
        }
        result.put("success", true);
        log.info("request: user/delete , ids: " + ids);
        ResponseUtil.write(response, result);
        return null;
    }


}
