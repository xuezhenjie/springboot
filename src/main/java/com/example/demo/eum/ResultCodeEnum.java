package com.example.demo.eum;

import lombok.Getter;

/**
 * @author xuezj
 * @version 1.0.0
 * @date 2021/8/12 16:29
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(true,20000,"成功"),
    UNKNOWN_ERROR(false,20001,"未知错误"),
    PARAM_ERROR(false,20002,"参数错误"),
    NULL_POINT(true,20000,"空指针异常"),
    HTTP_CLIENT_ERROR(true,20000,"客户端错误"),
    ;

    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}