package com.zlbteam.domain;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 约束验证器
 * @author zhoulibin
 */
public class MyConstraintValidator implements ConstraintValidator<MyValidator, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (null == s) {
            return false;
        }
        boolean isValid;
        if(Gender.MALE.getValue().equals(s) || Gender.FEMALE.getValue().equals(s)){
            isValid = true;
        }else {
            isValid = false;
        }
        return isValid;
    }

    public static enum Gender{
        /**
         * 男 1，女 2
         */
        MALE("男"),
        FEMALE("女");

        private final String value;

        private Gender(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }
}
