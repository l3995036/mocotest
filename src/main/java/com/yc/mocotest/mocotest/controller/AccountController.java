package com.yc.mocotest.mocotest.controller;

import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/acc")
public class AccountController {

    @ResponseBody
    @RequestMapping("/accountingMoco")
    public String accountingMoco(@RequestBody Map<String,Object> map){
        System.out.println(map);
        return "222222";
    }
}
