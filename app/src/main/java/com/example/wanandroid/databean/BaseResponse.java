package com.example.wanandroid.databean;

/**
 * @data on 2020/9/2 4:25 PM
 * @auther
 * @describe
 */
public class BaseResponse {
    public int errorCode;
    public String errorMsg;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isSuccess() {
        if (errorCode == 0) {
            return true;
        } else {
            return false;
        }
    }
}
