package com.zlbteam.domain;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 参数校验 Bean Validator
 * @author zhoulibin
 */
@Data
public class BeanValidator {

    @AssertTrue(message = "必须为 True")
    private Boolean isTrue;

    @AssertFalse(message = "必须为 False")
    private Boolean isFalse;

    @DecimalMax(value = "100", message = "必须为数字，其值小于或等于指定的最大值")
    private BigDecimal maxDecimal;

    @DecimalMax(value = "100", message = "必须为数字，其值大于或等于指定的最小值")
    private BigDecimal minDecimal;

    @Digits(integer = 1, fraction = 100, message = "必须为数字，其值必须再可接受的范围内")
    private BigDecimal digits;

    @Future(message = "必须是将来的日期")
    private Date future;

    @Past(message = "必须是过去的日期")
    private Date past;

    @Max(value = 100, message = "必须为数字，其值小于或等于指定的最大值")
    private Integer max;

    @Min(value = 1, message = "必须为数字，其值大于或等于指定的最小值")
    private Integer min;

    @NotNull(message = "不能为null")
    private String isNotNull;

    @Null(message = "必须为null")
    private String isNull;

    @Size(min = 1, max = 100, message = "集合的长度")
    private String size;

    @Pattern(regexp = "[A|B]",message = "必须符合正则表达式")
    private String pattern;

    @Email(message = "电子邮箱")
    private String email;

    @NotBlank(message = "不能为null，字符串长度大于0(限字符串)")
    private String isNotBlack;

    @NotEmpty(message = "不能为null，长度大于0")
    private String isNotEmpty;

    /**
     * 任何非原始类型
     * 被注释的元素是一个对象，需要检查此对象的所有字段值
     */
    @Valid
    private List<String> list;

}
