package com.zlbteam.domain;


import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.PastOrPresent;
import java.lang.annotation.*;

/**
 * 自定义验证类
 * @author zhoulibin
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyValidator.List.class)
@Constraint(validatedBy = MyConstraintValidator.class)
@Documented
public @interface MyValidator {

    String message() default "{com.zlbteam.domain.MyValidator.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String value();

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        MyValidator[] value();
    }
}
