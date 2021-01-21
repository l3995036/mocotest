package com.yc.mocotest.mocotest.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountingParamDataDTO implements Serializable {

    @Length(min = 0, max = 32)
    private String ERP_INS_ID; //	ERP端冲账唯一标识	C32

    @Length(min = 0, max = 32)
    private String SOURCE;    //来源系统	C32

    @Length(min = 0, max = 1)
    @NotNull
    private String TYPE;  //记账方式1结算账户记账2总账科目记账	 C1

    @Length(min = 0, max = 32)
    private String OLD_ERP_INS_ID;//原ERP端记账唯一标识 C32

    @Length(min = 0, max = 32)
    private String JNO;    //借款方账号	C32

    @Length(min = 0, max = 18)
    private String JKMH;    //借款方科目号	C18

    @XmlElement(name = "AMOUNT", namespace = "http://webservice.fdlk.nstc.com")
    @Digits(integer = 15, fraction = 2)
    private BigDecimal AMOUNT;// 记账金额	N15.2

    @Length(min = 0, max = 3)
    private String CURRENCY;    //币种	C3

    @Length(min = 0, max = 32)
    private String DNO;    //贷方账号	C32

    @Length(min = 0, max = 18)
    private String DKMH;    //贷方科目号	C18

    @Length(min = 0, max = 4)
    private String ParamId;//业务类型 结算账户做账必填

    private Integer DIR;//借贷方向 总账客户记账必填

    @Length(min = 0, max = 255)
    private String EXPLAIN;    //摘要	C255

    @Length(min = 0, max = 255)
    private String TEXTVALUE1;    //文本备用字段1	C255

    @Length(min = 0, max = 255)
    private String TEXTVALUE2;    //文本备用字段2	C255

    private BigDecimal NUMBERVALUE1;    //数字备用字段1	N

    @Digits(integer = 15, fraction = 2)
    private BigDecimal NUMBERVALUE2;//数字备用字段2	N15.2

    private Date DATEVALUE1;    //时间备用字段1	D

    private Date DATEVALUE2;    //时间备用字段2	D

}
