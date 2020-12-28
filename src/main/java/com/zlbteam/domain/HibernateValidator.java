package com.zlbteam.domain;

import lombok.Data;
import org.hibernate.validator.constraints.*;

/**
 * 参数校验 Hibernate Validator
 * @author zhoulibin
 */
@Data
public class HibernateValidator {

    @CreditCardNumber(message = "被注释的字符串必须通过Luhn校验算法，银行卡，信用卡等号码一般都用Luhn计算合法性")
    private String creditCardNumber;

    @Length(min = 1, max = 10, message = "长度范围")
    private Integer length;

    @Range(min = 1, max = 10, message = "元素的大小范围")
    private Integer range;

    @URL(host = "127.0.0.1", port = 8080, message = "被注释的字符串必须是一个有效的url")
    private String url;
}
