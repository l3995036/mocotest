package com.yc.mocotest.mocotest.webservice;

import com.yc.mocotest.mocotest.model.RequestData;
import org.springframework.web.bind.annotation.RequestBody;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;
import java.util.Map;

@WebService(name = "TxServiceGateway", targetNamespace = "http://webservice.fdlk.nstc.com")
public interface TxServiceGateway {

    @WebMethod
    //@WebResult(targetNamespace = "http://webservice.fdlk.nstc.com")
    String send(@WebParam(name = "data",targetNamespace = "http://webservice.fdlk.nstc.com") RequestData data);

}