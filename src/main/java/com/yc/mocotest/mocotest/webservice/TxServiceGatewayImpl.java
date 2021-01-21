package com.yc.mocotest.mocotest.webservice;

import com.alibaba.fastjson.JSON;
import com.yc.mocotest.mocotest.dto.AccountingParamDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@Component
@WebService(name = "TxServiceGateway", serviceName = "TxServiceGateway", targetNamespace = "http://webservice.fdlk.nstc.com",
        endpointInterface = "com.yc.mocotest.mocotest.webservice.TxServiceGateway")
public class TxServiceGatewayImpl implements TxServiceGateway {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    private final static String ONE = "1";
    private final static String TWO = "2";
    private final static String THREE = "3";

    @Override
    public String send(String code, AccountingParamDataDTO data) {
        Map<String,Object> result = new HashMap();
        String amount = data.getAMOUNT();
        if (null == code || null == amount) {
            String jsonString = redisTemplate.opsForValue().get("MPBS-T008_999999");
            //result = JSON.parseObject(jsonString, Map.class);
            return jsonString;
        }
        String substring = amount.substring(amount.length() - 1);
        if (substring.equals(ONE)) {
            String jsonString = redisTemplate.opsForValue().get("MPBS-T008_000000_1");
            //result = JSON.parseObject(jsonString, Map.class);
            return jsonString;
        }else if (substring.equals(TWO)) {
            String jsonString = redisTemplate.opsForValue().get("MPBS-T008_000000_0");
            //result = JSON.parseObject(jsonString, Map.class);
            return jsonString;
        } else if (substring.equals(THREE)) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String jsonString = redisTemplate.opsForValue().get("MPBS-T008_000000_1");
            result = JSON.parseObject(jsonString, Map.class);
            return jsonString;
        } else {
            String jsonString = redisTemplate.opsForValue().get("MPBS-T008_999999");
            //result = JSON.parseObject(jsonString, Map.class);
            return jsonString;
        }
    }

}