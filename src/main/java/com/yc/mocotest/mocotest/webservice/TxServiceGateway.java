package com.yc.mocotest.mocotest.webservice;

import com.yc.mocotest.mocotest.dto.ResultDTO;
import com.yc.mocotest.mocotest.dto.request.AccountingParamDataDTO;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "TxServiceGateway", targetNamespace = "http://webservice.fdlk.nstc.com")
public interface TxServiceGateway {

    @WebMethod
    @WebResult(name = "result", targetNamespace = "http://webservice.fdlk.nstc.com")
    ResultDTO accounting(@WebParam(name = "data",targetNamespace = "http://webservice.fdlk.nstc.com") AccountingParamDataDTO data);

}