package com.tay.futures.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ErrorInfo implements Serializable{

	/**
	 * 单个处理的errorcode
	 */
	private List<Integer> errorCode = new ArrayList<Integer>();
	private Map<Integer, Object[]> errorCodeMsg = new HashMap<Integer, Object[]>();




	public List<Integer> getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(List<Integer> errorCode) {
		this.errorCode = errorCode;
	}

	
	public Map<Integer, Object[]> getErrorCodeMsg() {
		return errorCodeMsg;
	}

	public void setErrorCodeMsg(Map<Integer, Object[]> errorCodeMsg) {
		this.errorCodeMsg = errorCodeMsg;
	}

	
	
	public void addErrorCode(Integer code) {
		if(null != code) {
			this.errorCode.add(code);
		}
	}

	public void addErrorCode(Integer code, Object[] msg) {
		if(null != code) {
			this.errorCode.add(code);
		}
		if(null != msg && msg.length > 0) {
			this.errorCodeMsg.put(code, msg);
		}
	}	




}
