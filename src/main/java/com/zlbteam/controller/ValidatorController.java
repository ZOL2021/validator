package com.zlbteam.controller;

import com.zlbteam.domain.MyValidator;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhoulibin
 */
@RestController
public class ValidatorController {

    @RequestMapping("/")
    @ResponseBody
    public Gender gender(@Validated @RequestBody Gender gender) {
        return gender;
    }

}

@Data
class Gender{
    @MyValidator(value = "男|女", message = "性别必须为男或女")
    private String gender;
}
