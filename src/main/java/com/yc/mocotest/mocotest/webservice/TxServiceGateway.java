package com.yc.mocotest.mocotest.webservice;

import com.yc.mocotest.mocotest.config.MapAdapter;
import com.yc.mocotest.mocotest.config.XmlMapAdapter;
import com.yc.mocotest.mocotest.dto.AccountingParamDataDTO;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Map;

@WebService(name = "TxServiceGateway", targetNamespace = "http://webservice.fdlk.nstc.com")
public interface TxServiceGateway {

    @WebMethod
    //@WebResult(name = "result", targetNamespace = "http://webservice.fdlk.nstc.com")
    //@XmlJavaTypeAdapter(MapAdapter.class)
    public String send(@WebParam(name = "code",targetNamespace = "http://webservice.fdlk.nstc.com") String code,
                                                                               @WebParam(name = "data",targetNamespace = "http://webservice.fdlk.nstc.com") AccountingParamDataDTO data);

}