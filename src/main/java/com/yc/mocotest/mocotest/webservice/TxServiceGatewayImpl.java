package com.yc.mocotest.mocotest.webservice;

import com.alibaba.fastjson.JSONObject;
import com.yc.mocotest.mocotest.model.RequestData;
import org.springframework.stereotype.Component;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Component
@WebService(name = "TxServiceGateway", serviceName = "TxServiceGateway", targetNamespace = "http://webservice.fdlk.nstc.com",
        endpointInterface = "com.yc.mocotest.mocotest.webservice.TxServiceGateway")
public class TxServiceGatewayImpl implements TxServiceGateway {

    private static final String RESPONSE_MESSAGE = "1";

    @Override
    public String send(RequestData data) {
        System.out.println(data);
        return "";
/*
        String response_message = null;
        JSONObject param = JSONObject.parseObject(message);
        String amount = param.getString("AMOUNT");

        if (null == amount) {
            return "";
        }
        String substring = amount.substring(amount.length() - 1);
        if(substring == "1"){
            return "";
        }
        if(substring == "2"){

            return "";
        }
        return response_message;
    }
*/

    }
}