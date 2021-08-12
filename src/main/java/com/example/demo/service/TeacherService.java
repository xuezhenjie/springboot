package com.example.demo.service;

import com.example.demo.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuezj
 * @version 1.0.0
 * @date 2021/8/12 16:36
 */
@Service
public interface TeacherService {

    List<Teacher> list();
}
