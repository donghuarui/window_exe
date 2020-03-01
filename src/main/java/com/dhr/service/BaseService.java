package com.dhr.service;

import com.dhr.entity.HttpResult;

import java.util.Map;

/**
 * 提供 get post 访问 http请求的接口
 */
public interface BaseService {
    /**
     * get请求api
     *
     * @param url     必填
     * @param params  可选
     * @param headers 可选
     * @return
     */
    String doGet(String url, Map<String, Object> params, Map<String, Object> headers) throws Exception;

    /**
     * post请求
     *
     * @param url     必填
     * @param params  可选
     * @param headers 可选
     * @return
     */
    HttpResult doPost(String url, Map<String, Object> params, Map<String, Object> headers) throws Exception;
}
