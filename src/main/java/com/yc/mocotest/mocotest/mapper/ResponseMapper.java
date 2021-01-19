package com.yc.mocotest.mocotest.mapper;

import com.yc.mocotest.mocotest.model.Response;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseMapper {

    Response getResponseByCode(String code);

    void save(String code, String response);

}
