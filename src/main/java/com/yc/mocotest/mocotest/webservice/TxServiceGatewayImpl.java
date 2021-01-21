package com.yc.mocotest.mocotest.webservice;

import com.yc.mocotest.mocotest.dto.AccountingParamDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.math.BigDecimal;

@Component
@WebService(name = "TxServiceGateway", serviceName = "TxServiceGateway", targetNamespace = "http://webservice.fdlk.nstc.com",
        endpointInterface = "com.yc.mocotest.mocotest.webservice.TxServiceGateway")
public class TxServiceGatewayImpl implements TxServiceGateway {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    private final static String ONE = "1";
    private final static String TWO = "2";
    private final static String THREE = "3";

    @Override
    public String send(String code, AccountingParamDataDTO data) {
        BigDecimal amount = data.getAMOUNT();
        if (null == code || null == amount) {
            return redisTemplate.opsForValue().get("MPBS-T008_999999");
        }
        String substring = amount.toString().substring(amount.toString().length() - 1);
        if (substring.equals(ONE)) {
            return redisTemplate.opsForValue().get("MPBS-T008_000000_1");
        } else if (substring.equals(TWO)) {
            return redisTemplate.opsForValue().get("MPBS-T008_000000_0");
        } else if (substring.equals(THREE)) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return redisTemplate.opsForValue().get("MPBS-T008_000000_1");
        } else {
            return redisTemplate.opsForValue().get("MPBS-T008_999999");
        }
    }

}