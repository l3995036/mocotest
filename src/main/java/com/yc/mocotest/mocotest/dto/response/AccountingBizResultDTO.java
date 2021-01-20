package com.yc.mocotest.mocotest.dto.response;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountingBizResultDTO implements Serializable {

    /**
     * ERP端记账唯一标识
     */
    @XmlElement(name = "ERP_INS_ID", namespace = "http://webservice.fdlk.nstc.com")
    private String ERP_INS_ID;

    /**
     * 执行结果
     */
    @XmlElement(name = "OUT_RESULT", namespace = "http://webservice.fdlk.nstc.com")
    private Integer OUT_RESULT;

    /**
     * 错误信息
     */
    @XmlElement(name = "OUT_MSG", namespace = "http://webservice.fdlk.nstc.com")
    private String OUT_MSG;

}
