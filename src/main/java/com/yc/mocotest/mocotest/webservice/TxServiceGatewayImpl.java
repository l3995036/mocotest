package com.yc.mocotest.mocotest.webservice;

import com.yc.mocotest.mocotest.dto.ResultDTO;
import com.yc.mocotest.mocotest.dto.request.AccountingParamDataDTO;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.math.BigDecimal;

@Component
@WebService(name = "TxServiceGateway", serviceName = "TxServiceGateway", targetNamespace = "http://webservice.fdlk.nstc.com",
        endpointInterface = "com.yc.mocotest.mocotest.webservice.TxServiceGateway")
public class TxServiceGatewayImpl implements TxServiceGateway {

    private static final String RESPONSE_MESSAGE = "1";

    @Override
    public ResultDTO accounting(AccountingParamDataDTO data) {
        ResultDTO result = new ResultDTO();
        BigDecimal amount = data.getAMOUNT();
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            result = new ResultDTO("000000", "", "");

        }
        return result;
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