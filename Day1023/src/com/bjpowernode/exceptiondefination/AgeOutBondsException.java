package com.bjpowernode.exceptiondefination;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 14:43
 */
public class AgeOutBondsException extends RuntimeException {
    public AgeOutBondsException() {
    }

    public AgeOutBondsException(String message) {
        super(message);
    }
}
