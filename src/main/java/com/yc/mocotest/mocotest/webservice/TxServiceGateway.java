package com.yc.mocotest.mocotest.webservice;

import com.yc.mocotest.mocotest.dto.AccountingParamDataDTO;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "TxServiceGateway", targetNamespace = "http://webservice.fdlk.nstc.com")
public interface TxServiceGateway {

    @WebMethod
    public String send(@WebParam(name = "code",targetNamespace = "http://webservice.fdlk.nstc.com") String code,
                       @WebParam(name = "data",targetNamespace = "http://webservice.fdlk.nstc.com") AccountingParamDataDTO data);

}