package com.example.demo.controller;

import com.example.demo.eum.UserErrorEnum;
import com.example.demo.exception.UserCheckException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuezj
 * @version 1.0.0
 * @date 2021/8/12 10:24
 */
@RestController
public class Test {

    @GetMapping("/test")
    public String list(){
        UserErrorEnum.CANCEL_AUDIT_FAILED.name();

        return "hello";
    }

    @GetMapping("/test2")
    public void list2(){
        throw new UserCheckException("");
    }
}
