package com.study.designmode.exception;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2021/3/30 17:29
 **/
public class BeanCreationFailureException extends Exception{
    public BeanCreationFailureException(String message, Throwable e) {
        super(message, e);
    }
}
