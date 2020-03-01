package com.dhr.window_exe;

import com.dhr.component.HttpAPIService;
import com.dhr.entity.HttpResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WindowExeApplicationTests {
    @Resource
    private HttpAPIService api;

    @Test
    public void testGet() throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("id", "6561651");
        Map<String, Object> headers = new HashMap<>();
        headers.put("Authentication-Token", "6561651");
        String result = api.doGet("http://localhost:9091/user/findOne", params, headers);
    }

    @Test
    public void testPost() throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("username", "吸血鬼2W46RT252");
        params.put("password", "123456");
        params.put("valid", '1');
        Map<String, Object> headers = new HashMap<>();
        headers.put("Authentication-Token", "6561651");
        HttpResult result = api.doPost("http://localhost:9091/user/register", params, headers);
        System.out.println("22222" + result);
    }

}
