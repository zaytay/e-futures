package com.tay.futures.exception;

import java.util.HashMap;
import java.util.Map;


public class ErrorCode {

    private static Map<Integer, String> msgMap = new HashMap<Integer, String>();


    public static final Integer CODE_NOT_EXIST = 1;
    static{addToMsgMap(CODE_NOT_EXIST, "棉花批号不存在");}
    public static final Integer RANGE_NOT_MATCH = 2;
    static{addToMsgMap(RANGE_NOT_MATCH, "没有匹配到模板中的区间策略的任何区间,请检查模板设置");}
    public static final Integer RATIO_NOT_MATCH = 3;
    static{addToMsgMap(RATIO_NOT_MATCH, "升贴水策略未设置,,请检查模板设置");}



    private static void addToMsgMap(Integer code, String msg) {
        if(null != msgMap.get(code)) {
            throw new RuntimeException("code already existed in msgMap. code:" + code);
        }
        msgMap.put(code, msg);
    }

    public static String getMsg(Integer code) {
        return msgMap.get(code);
    }



}
