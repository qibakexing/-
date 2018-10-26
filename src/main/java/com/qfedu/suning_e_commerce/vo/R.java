package com.qfedu.suning_e_commerce.vo;

import java.io.Serializable;


public class R implements Serializable {
    private int code;
    private String msg;
    private Object obj;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public R(int code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public R() {
    }
}
