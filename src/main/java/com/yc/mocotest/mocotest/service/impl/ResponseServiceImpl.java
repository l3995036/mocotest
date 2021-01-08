package com.yc.mocotest.mocotest.service.impl;

import com.yc.mocotest.mocotest.mapper.ResponseMapper;
import com.yc.mocotest.mocotest.model.Response;
import com.yc.mocotest.mocotest.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ResponseServiceImpl implements ResponseService {

    @Resource
    ResponseMapper responseMapper;

    @Override
    public Response getResponseByCode(String code) {
        return responseMapper.getResponseByCode(code);
    }
}