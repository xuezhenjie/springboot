package com.example.demo.exception;

import com.example.demo.eum.ResultCodeEnum;
import lombok.Data;

/**
 * 自定义全局异常类
 * @author xuezj
 * @version 1.0.0
 * @date 2021/8/12 16:39
 */
@Data
public class CMSException extends RuntimeException {
    private Integer code;

    public CMSException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public CMSException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "CMSException{" + "code=" + code + ", message=" + this.getMessage() + '}';
    }
}
