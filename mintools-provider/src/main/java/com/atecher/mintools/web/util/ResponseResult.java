package com.atecher.mintools.web.util;

import java.io.Serializable;


public class ResponseResult<T> implements Serializable {
    private String code;
    private T result;

    public ResponseResult(String code, T result) {
        this.result = result;
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
