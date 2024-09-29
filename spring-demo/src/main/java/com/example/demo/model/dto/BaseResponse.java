package com.example.demo.model.dto;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private T data;
    private String status;
    private String message;
    private String statusCode;
}
