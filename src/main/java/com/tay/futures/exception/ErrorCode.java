package com.tay.futures.exception;

import java.util.HashMap;
import java.util.Map;


public class ErrorCode {

    private static Map<Integer, String> msgMap = new HashMap<Integer, String>();


    /** 邀请错误 **/
    public static final Integer CODE_NOT_EXIST = 1;
    static{addToMsgMap(CODE_NOT_EXIST, "棉花批号不存在");}



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
