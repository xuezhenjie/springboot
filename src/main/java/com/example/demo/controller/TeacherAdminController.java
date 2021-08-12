package com.example.demo.controller;

import com.example.demo.Teacher;
import com.example.demo.eum.R;
import com.example.demo.exception.GlobalExceptionHandler;
import com.example.demo.service.TeacherService;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xuezj
 * @version 1.0.0
 * @date 2021/8/12 16:33
 */
@RestController
@RequestMapping("/api/v1/users")
public class TeacherAdminController {
    private static final Logger logger = LoggerFactory.getLogger(TeacherAdminController.class);
    @GetMapping
    public R list() {
        logger.error(R.error().getMessage() + "------test特");
        return R.ok().data("itms", null).message("用户列表");
    }
}
