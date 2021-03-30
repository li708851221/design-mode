package com.study.designmode.create.factory.di.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2021/3/30 16:54
 **/

public class BeanDefinition {
    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;
    // 省略必要的getter/setter/constructors

    public boolean isSingleton() {
        return scope.equals(Scope.SINGLETON);
    }

    public String getId() {
        return this.id;
    }

    public boolean isLazyInit() {
        return this.lazyInit;
    }

    public String getClassName() {
        return this.className;
    }

    public List<ConstructorArg> getConstructorArgs() {
        return this.constructorArgs;
    }


    public static enum Scope {
        /**
         * 单例模式
         */
        SINGLETON,
        /**
         * 原型模式
         */
        PROTOTYPE
    }

    public static class ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg;

        public boolean getIsRef() {
            return this.isRef;
        }

        public Class getType() {
            return type;
        }

        public Object getArg() {
            return arg;
        }
    }
}