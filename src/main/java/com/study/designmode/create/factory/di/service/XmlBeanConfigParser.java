package com.study.designmode.create.factory.di.service;

import org.springframework.beans.factory.config.BeanDefinition;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2021/3/30 16:00
 **/

public class XmlBeanConfigParser implements IBeanConfigParser {

    @Override
    public List<BeanDefinition> parse(InputStream inputStream) {
        String content = null;
        // TODO:...
        //return parse(content);
        return null;
    }

    @Override
    public List<BeanDefinition> parse(String configContent) {
        List<BeanDefinition> beanDefinitions = new ArrayList<>();
        // TODO:...
        //return beanDefinitions;
        return null;
    }

}

