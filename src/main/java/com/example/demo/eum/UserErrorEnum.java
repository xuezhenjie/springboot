package com.example.demo.eum;

import com.example.demo.constant.BaseErrorInfoConstants;

/**
 * @author xuezj
 * @version 1.0.0
 * @date 2021/8/12 10:34
 */
public enum UserErrorEnum {



    /**
     * 取消审核失败！
     */
    CANCEL_AUDIT_FAILED("A0721", "取消审核!"),

    ;


    UserErrorEnum(String errorCode, String errorMessage) {
    }
}
