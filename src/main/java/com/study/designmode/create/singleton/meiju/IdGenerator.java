package com.study.designmode.create.singleton.meiju;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author cvLee
 * @Description
 * 通过枚举实现单例模式
 * 通过 Java 枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性
 * @Date 2021/3/29 11:08
 **/
public enum IdGenerator {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}

