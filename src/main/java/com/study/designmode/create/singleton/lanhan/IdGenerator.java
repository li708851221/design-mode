package com.study.designmode.create.singleton.lanhan;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author cvLee
 * @Description
 * 懒汉式单例模式示例
 * 优点：支持延迟加载
 * 缺点：并发度低
 * @Date 2021/3/29 10:53
 **/

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private IdGenerator() {}
    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
