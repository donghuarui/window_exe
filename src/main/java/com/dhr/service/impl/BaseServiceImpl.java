package com.dhr.service.impl;

import com.dhr.component.HttpAPIService;
import com.dhr.entity.HttpResult;
import com.dhr.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class BaseServiceImpl implements BaseService {
    @Autowired
    private HttpAPIService api;

    @Override
    public String doGet(String url, Map<String, Object> params, Map<String, Object> headers) throws Exception {
        return api.doGet(url, params, headers);
    }

    @Override
    public HttpResult doPost(String url, Map<String, Object> params, Map<String, Object> headers) throws Exception {
        return api.doPost(url, params, headers);
    }
}
