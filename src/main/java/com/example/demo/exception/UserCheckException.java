package com.example.demo.exception;

/**
 * @author xuezj
 * @version 1.0.0
 * @date 2021/8/12 10:23
 */
public class UserCheckException extends RuntimeException{
    public UserCheckException() {
    }

    public UserCheckException(String message) {
        super(message);
    }

    public UserCheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserCheckException(Throwable cause) {
        super(cause);
    }

    public UserCheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
