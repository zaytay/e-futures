package com.tay.futures.exception;

public class BusinessException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public BusinessException(Integer code) {
        super();
        errorInfo = new ErrorInfo();
        if(null != code) {
            this.errorInfo.addErrorCode(code);
        }
    }


    private ErrorInfo errorInfo;

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

}
