package com.yc.mocotest.mocotest.service.impl;

import com.yc.mocotest.mocotest.mapper.ResponseMapper;
import com.yc.mocotest.mocotest.model.Response;
import com.yc.mocotest.mocotest.service.AccountService;
import com.yc.mocotest.mocotest.service.ResponseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    //@Resource
    ResponseMapper responseMapper;

    @Override
    public void saveAccoutingData(String data) {
        responseMapper.save("1111", data);
    }

}