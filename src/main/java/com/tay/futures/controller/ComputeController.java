package com.tay.futures.controller;


import com.tay.futures.service.CottonPriceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/compute")
public class ComputeController {


    private static final Logger log = Logger.getLogger(UserController.class);// 日志文件

    @Autowired
    private CottonPriceService cottonPriceService;


    @RequestMapping("/cottonPrice")
    public String cottonPriceCompute(@RequestParam(value = "code", required = false) Long  code,
                                     @RequestParam(value = "templateId", required = false) Long templateId, Model model) throws Exception {
        log.info("request: compute/cottonPrice  ");

        Double price=cottonPriceService.computePrice(code,templateId);
        model.addAttribute("code",code);
        model.addAttribute("templateId",templateId);
        model.addAttribute("price",price);
        return "main";
    }




}
