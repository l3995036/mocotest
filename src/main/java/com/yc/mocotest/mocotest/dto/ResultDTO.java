package com.yc.mocotest.mocotest.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class ResultDTO<T> implements Serializable {

    private String resultCode;

    private String resultMsg;

    private T data;

    public ResultDTO() {
    }

    public ResultDTO(String resultCode, T data, String resultMsg) {
        this.resultCode = resultCode;
        this.data = data;
        this.resultMsg = resultMsg;
    }

    public ResultDTO(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public ResultDTO(String resultMsg) {
        this.resultMsg = resultMsg;
    }

}
