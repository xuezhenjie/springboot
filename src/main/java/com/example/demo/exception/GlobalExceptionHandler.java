package com.example.demo.exception;

import com.example.demo.eum.R;
import com.example.demo.eum.ResultCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;

/**
 * 统一异常处理器
 *
 * @author xuezj
 * @version 1.0.0
 * @date 2021/8/12 16:40
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 通用异常处理方法
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        // 修改统一异常处理器，将异常方法中的直接打印改为日志输入并打印
        logger.error(ExceptionUtil.getMessage(e));
        // 通用异常结果
        return R.error();
    }

    /**
     * 指定异常处理方法
     * @param e
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public R error(NullPointerException e) {
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.NULL_POINT);
    }

    @ExceptionHandler(HttpClientErrorException.class)
    @ResponseBody
    public R error(IndexOutOfBoundsException e) {
        e.printStackTrace();
        return R.setResult(ResultCodeEnum.HTTP_CLIENT_ERROR);
    }

    /**
     * 自定义定异常处理方法
     * @param e
     * @return
     */
    @ExceptionHandler(CMSException.class)
    @ResponseBody
    public R error(CMSException e) {
        e.printStackTrace();
        return R.error().message(e.getMessage()).code(e.getCode());
    }
}