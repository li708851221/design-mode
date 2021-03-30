package com.study.designmode.create.singleton.jingtaineibulei;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author cvLee
 * @Description
 * 静态内部类单例模式示例
 * 优点：线程安全，延迟加载
 * @Date 2021/3/29 10:59
 **/

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private IdGenerator() {}

    private static class SingletonHolder{
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
