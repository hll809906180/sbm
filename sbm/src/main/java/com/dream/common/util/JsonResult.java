package com.dream.common.util;

import java.util.List;

/**
 * @description json 返回结果
 * @author heleilei
 * @date 2018-07-23
 */
public class JsonResult {
    private List rows;
    private int tatol;
    private Object resultData;
    private String resultMeg;
    private String code;

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public int getTatol() {
        return tatol;
    }

    public void setTatol(int tatol) {
        this.tatol = tatol;
    }

    public String getResultMeg() {
        return resultMeg;
    }

    public void setResultMeg(String resultMeg) {
        this.resultMeg = resultMeg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
