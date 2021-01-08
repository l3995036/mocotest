package com.yc.mocotest.mocotest.controller;

import com.yc.mocotest.mocotest.model.Response;
import com.yc.mocotest.mocotest.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class ResponseController {
    @Autowired
    ResponseService responseService;
    @RequestMapping("/response")
    public String getResponse(String code) {
        String response = responseService.getResponseByCode(code).getResponse();
        return response;
    }

}
