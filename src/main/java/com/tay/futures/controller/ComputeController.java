package com.tay.futures.controller;


import com.tay.futures.entity.CottonTemplate;
import com.tay.futures.entity.User;
import com.tay.futures.exception.BusinessException;
import com.tay.futures.exception.ErrorCode;
import com.tay.futures.exception.ErrorInfo;
import com.tay.futures.service.CottonPriceService;
import com.tay.futures.service.CottonTemplateService;
import com.tay.futures.util.ResponseUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/compute")
public class ComputeController {


    private static final Logger log = Logger.getLogger(UserController.class);// 日志文件

    @Autowired
    private CottonPriceService cottonPriceService;

    @Autowired
    private CottonTemplateService cottonTemplateService;


    @RequestMapping("/cottonPrice")
    public String cottonPriceCompute(@RequestParam(value = "code", required = false) Long  code,
                                     @RequestParam(value = "templateId", required = false) Long templateId,
                                     Model model,HttpServletResponse response,HttpServletRequest request
    ) throws Exception {
        log.info("request: compute/cottonPrice  ");

        Double price= null;
        try {
            price = cottonPriceService.computePrice(code,templateId);
        } catch (BusinessException e) {
            ResponseUtil.write(response, ErrorCode.getMsg(e.getErrorInfo().getErrorCode().get(0)));
            return null;
        }
        model.addAttribute("code",code);
        HttpSession session = request.getSession();
        User currentUser=(User)session.getAttribute("currentUser");
        List<CottonTemplate> cottonTemplateList=cottonTemplateService.getAllCottonTemplateByUid(currentUser.getId());
        model.addAttribute("templateId",templateId);
        model.addAttribute("price",price);
        model.addAttribute("cottonTemplateList",cottonTemplateList);
        return "main";
    }


    @RequestMapping("/batchComputeIndex")
    public String batchComputeIndex(
                                     Model model,HttpServletResponse response,HttpServletRequest request
    ) throws Exception {
        log.info("request: batchComputeIndex  ");

        HttpSession session = request.getSession();
        User currentUser=(User)session.getAttribute("currentUser");
        List<CottonTemplate> cottonTemplateList=cottonTemplateService.getAllCottonTemplateByUid(currentUser.getId());
        model.addAttribute("cottonTemplateList",cottonTemplateList);
        return "WEB-INF/jsp/compute/batchCompute";
    }




}
