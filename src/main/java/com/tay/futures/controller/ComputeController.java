package com.tay.futures.controller;


import com.tay.futures.constants.CottonPattern;
import com.tay.futures.dto.CottonBatchDto;
import com.tay.futures.entity.CottonBatch;
import com.tay.futures.entity.CottonTemplate;
import com.tay.futures.entity.User;
import com.tay.futures.exception.BusinessException;
import com.tay.futures.exception.ErrorCode;
import com.tay.futures.service.CottonPriceService;
import com.tay.futures.service.CottonTemplateService;
import com.tay.futures.util.DateUtil;
import com.tay.futures.util.ExcelUtils;
import com.tay.futures.util.ResponseUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/compute")
public class ComputeController {


    private static final Logger log = LoggerFactory.getLogger(UserController.class);// 日志文件

    @Autowired
    private CottonPriceService cottonPriceService;

    @Autowired
    private CottonTemplateService cottonTemplateService;

    public static final String DOWNLOAD_TEMPLATE_NAME = "棉花数据导入模板.xlsx";

    public static final String COTTON_PRICE_FILE= "棉花数据计算价格.xlsx";

    public static final String COTTON_PRICE_FILE_NAME= "棉花批量计算结果";



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


    @RequestMapping("/downloadPattern")
    @ResponseBody
    public String downloadPattern(HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<String> headerNameList = CottonPattern.getHeaderNamesExcludePrice();
        //downloadPattern ignore price
        String[] headerNames=headerNameList.toArray(new String[headerNameList.size()]);
        List<String[]> rows = new ArrayList<>(1);
        String[] row = new String[headerNames.length];
        for(int i=0;i<headerNames.length;i++){
            row[i] = StringUtils.EMPTY;
        }
        rows.add(row);
        ExcelUtils.writeExcelTable(request, response, DOWNLOAD_TEMPLATE_NAME, headerNames, rows);
        return null;
    }


    /**
     * 通过Excel上传并计算
     * @param request
     * @param sourceFile
     * @return
     * @throws IOException
     */
    @RequestMapping("/upload")
    @ResponseBody
    public String uploadCottonBatch(HttpServletRequest request,
                                    HttpServletResponse response,
                                    @RequestParam("sourceFile") MultipartFile sourceFile,
                                    @RequestParam("templateId") Long templateId ) throws Exception {
        Assert.notNull(sourceFile);

        String originalFilename=sourceFile.getOriginalFilename();
        long size =sourceFile.getSize();
        if (originalFilename==null ||("").equals(originalFilename) && size==0){
            log.error("upload file is invalid ");
            ResponseUtil.write(response, "上传文件无效");
        } else {
            List<CottonBatchDto> cottonBatchDtoList =  batchImport(originalFilename,sourceFile);

            if(CollectionUtils.isEmpty(cottonBatchDtoList)){
                log.info("batchImport file {} data is empty",originalFilename);
                ResponseUtil.write(response, "上传数据为空");

            }else {
                cottonBatchDtoList=cottonPriceService.batchComputePrice(cottonBatchDtoList,templateId);
                List<String> headerNameList = CottonPattern.getHeaderNames();
                String[] headerNames=headerNameList.toArray(new String[headerNameList.size()]);
                List<String[]> rows = new ArrayList<>(cottonBatchDtoList.size());
                for(CottonBatchDto dto:cottonBatchDtoList){
                    String[] row = new String[headerNames.length];
                    row[0] =dto.getProductionCode().toString();
                    row[1] =dto.getColourW1().toString();
                    row[2] =dto.getColourW2().toString();
                    row[3] =dto.getColourW3().toString();
                    row[4] =dto.getColourW4().toString();
                    row[5] =dto.getColourW5().toString();
                    row[6] =dto.getColourL1().toString();
                    row[7] =dto.getColourL2().toString();
                    row[8] =dto.getColourL3().toString();
                    row[9] =dto.getColourLy1().toString();
                    row[10] =dto.getColourLy2().toString();
                    row[11] =dto.getColourLy3().toString();
                    row[12] =dto.getColourY1().toString();
                    row[13] =dto.getColourY2().toString();
                    row[14] =dto.getGinningP1().toString();
                    row[15] =dto.getGinningP2().toString();
                    row[16] =dto.getGinningP3().toString();
                    row[17] =dto.getAvgLength().toString();
                    row[18] =dto.getAvgMicronaire().toString();
                    row[19] =dto.getAvgEvenness().toString();
                    row[20] =dto.getStrength().toString();
                    row[21] =dto.getPrice().toString();
                    rows.add(row);
                }
                HttpSession session = request.getSession();
                User currentUser=(User)session.getAttribute("currentUser");
                String fileName=COTTON_PRICE_FILE_NAME+"_"+ DateUtil.getCurrentDateStr()+"_" +currentUser.getUserName()+".xlsx";
                ExcelUtils.writeExcelTable(request, response, fileName, headerNames, rows);
            }
        }
        return null;
    }


    private List<CottonBatchDto> batchImport(String originalFilename, MultipartFile sourceFile) throws Exception {
        List<List<Object>> objectList = ExcelUtils.getBankListByExcel(sourceFile.getInputStream(), originalFilename);
        List<CottonBatchDto> cottonBatchList=new ArrayList<>();
        if (objectList.isEmpty()){
            return null;
        }
        for (int i = 0; i < objectList.size(); i++) {
            List<Object> rowObject = objectList.get(i);
            CottonBatchDto cottonBatch=new CottonBatchDto();
            cottonBatch.setProductionCode(Long.valueOf(rowObject.get(0).toString()));
            cottonBatch.setColourW1("".equals(rowObject.get(1).toString() ) ? 0.0 : Double.valueOf(rowObject.get(1).toString()));
            cottonBatch.setColourW2("".equals(rowObject.get(2).toString() ) ? 0.0 : Double.valueOf(rowObject.get(2).toString()));
            cottonBatch.setColourW3("".equals(rowObject.get(3).toString() ) ? 0.0 : Double.valueOf(rowObject.get(3).toString()));
            cottonBatch.setColourW4("".equals(rowObject.get(4).toString() ) ? 0.0 : Double.valueOf(rowObject.get(4).toString()));
            cottonBatch.setColourW5("".equals(rowObject.get(5).toString() ) ? 0.0 : Double.valueOf(rowObject.get(5).toString()));
            cottonBatch.setColourL1("".equals(rowObject.get(6).toString() ) ? 0.0 : Double.valueOf(rowObject.get(6).toString()));
            cottonBatch.setColourL2("".equals(rowObject.get(7).toString() ) ? 0.0 : Double.valueOf(rowObject.get(7).toString()));
            cottonBatch.setColourL3("".equals(rowObject.get(8).toString() ) ? 0.0 : Double.valueOf(rowObject.get(8).toString()));
            cottonBatch.setColourLy1("".equals(rowObject.get(9).toString() ) ? 0.0 : Double.valueOf(rowObject.get(9).toString()));
            cottonBatch.setColourLy2("".equals(rowObject.get(10).toString() ) ? 0.0 : Double.valueOf(rowObject.get(10).toString()));
            cottonBatch.setColourLy3("".equals(rowObject.get(11).toString() ) ? 0.0 : Double.valueOf(rowObject.get(11).toString()));
            cottonBatch.setColourY1("".equals(rowObject.get(12).toString() ) ? 0.0 : Double.valueOf(rowObject.get(12).toString()));
            cottonBatch.setColourY2("".equals(rowObject.get(13).toString() ) ? 0.0 : Double.valueOf(rowObject.get(13).toString()));
            cottonBatch.setGinningP1("".equals(rowObject.get(14).toString() ) ? 0.0 : Double.valueOf(rowObject.get(14).toString()));
            cottonBatch.setGinningP2("".equals(rowObject.get(15).toString() ) ? 0.0 : Double.valueOf(rowObject.get(15).toString()));
            cottonBatch.setGinningP3("".equals(rowObject.get(16).toString() ) ? 0.0 : Double.valueOf(rowObject.get(16).toString()));
            cottonBatch.setAvgLength("".equals(rowObject.get(17).toString() ) ? 0.0 : Double.valueOf(rowObject.get(17).toString()));
            cottonBatch.setAvgMicronaire("".equals(rowObject.get(18).toString() ) ? 0.0 : Double.valueOf(rowObject.get(18).toString()));
            cottonBatch.setAvgEvenness("".equals(rowObject.get(19).toString() ) ? 0.0 : Double.valueOf(rowObject.get(19).toString()));
            cottonBatch.setStrength("".equals(rowObject.get(20).toString() ) ? 0.0 : Double.valueOf(rowObject.get(20).toString()));
            cottonBatchList.add(cottonBatch);
        }
        return cottonBatchList;
    }





}
