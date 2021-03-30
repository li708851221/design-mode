package com.study.designmode.create.factory.factorymethod;

import com.study.designmode.create.factory.ruleconfigservice.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2021/3/30 15:11
 **/
//因为工厂类只包含方法，不包含成员变量，完全可以复用，
//不需要每次都创建新的工厂类对象，所以，简单工厂模式的第二种实现思路更加合适。
public class RuleConfigParserFactoryMap { //工厂的工厂
    private static final Map<String, IRuleConfigParser> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParser());
        cachedFactories.put("xml", new XmlRuleConfigParser());
        cachedFactories.put("yaml", new YamlRuleConfigParser());
        cachedFactories.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        IRuleConfigParser parserFactory = cachedFactories.get(type.toLowerCase());
        return parserFactory;
    }
}