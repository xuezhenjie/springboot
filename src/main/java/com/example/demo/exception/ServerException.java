package com.example.demo.exception;

/**
 * @author xuezj
 * @version 1.0.0
 * @date 2021/8/12 10:21
 */
public class ServerException extends RuntimeException{
    public ServerException() {
    }

    public ServerException(String message) {
        super(message);
    }

    public ServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerException(Throwable cause) {
        super(cause);
    }

    public ServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
