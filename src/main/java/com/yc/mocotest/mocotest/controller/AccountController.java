package com.yc.mocotest.mocotest.controller;

import com.alibaba.fastjson.JSON;
import com.sun.javafx.collections.MappingChange;
import com.yc.mocotest.mocotest.model.Response;
import com.yc.mocotest.mocotest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/acc")
public class AccountController {

    @Autowired
    RedisTemplate<String, String> redisTemplate;
    @Autowired
    private AccountService accountService;

    @RequestMapping("/accountingMoco")
    public String accountingMoco(@RequestBody Map<String,Object> map){
        //accountService.saveAccoutingData(JSON.toJSONString(map));
        if (null == map) {
            return "fail";
        }

        Response response = new Response();
        response.setId(1);
        response.setCode("2");
        response.setResponse("3");

        redisTemplate.opsForValue().set("abc", JSON.toJSONString(response));

        String abc = redisTemplate.opsForValue().get("abc");
        Response response1 = JSON.parseObject(abc, Response.class);

        return "success";
    }

}
