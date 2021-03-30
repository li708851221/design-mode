package com.study.designmode.create.singleton.ehan;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author cvLee
 * @Description
 * 饿汉式单例模式示例
 * 优点：静态实例，在类加载的时候已经创建好了，创建过程是线程安全的
 * 缺点：不支持延迟加载
 * @Date 2021/3/29 10:46
 **/

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
