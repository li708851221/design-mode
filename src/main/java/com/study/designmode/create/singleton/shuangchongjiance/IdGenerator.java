package com.study.designmode.create.singleton.shuangchongjiance;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author cvLee
 * @Description
 * 双重检测单例模式示例
 * 优点：支持延迟加载，支持高并发
 * 关联知识点：volatile synchronized
 * @Date 2021/3/29 10:55
 **/

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private volatile static IdGenerator instance;
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        if (instance == null) {
            synchronized(IdGenerator.class) { // 此处为类级别的锁
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}