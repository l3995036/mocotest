package com.yc.mocotest.mocotest.dto.request;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountingParamDataDTO implements Serializable {

    @XmlElement(name = "AMOUNT", namespace = "http://webservice.fdlk.nstc.com")
    private BigDecimal AMOUNT;

}
