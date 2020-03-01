package com.dhr.entity;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class HttpResult {
    // 响应码
    @NonNull
    private Integer code;

    // 响应体
    @NonNull
    private String body;

}
