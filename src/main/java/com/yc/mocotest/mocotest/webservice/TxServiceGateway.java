package com.yc.mocotest.mocotest.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "TxServiceGateway", targetNamespace = "http://webservice.fdlk.nstc.com")
public interface TxServiceGateway {
    @WebMethod
    //@WebResult(name = "sendResponse", targetNamespace = "http://webservice.fdlk.nstc.com", partName = "returnMessage")
    public String send(@WebParam(name = "message") String message);

}