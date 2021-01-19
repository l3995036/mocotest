package com.yc.mocotest.mocotest.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestData implements Serializable {

    @XmlElement(name = "amount", namespace = "http://webservice.fdlk.nstc.com")
    private String amount;

}
