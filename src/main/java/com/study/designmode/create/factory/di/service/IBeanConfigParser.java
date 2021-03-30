package com.study.designmode.create.factory.di.service;


import org.springframework.beans.factory.config.BeanDefinition;

import java.io.InputStream;
import java.util.List;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2021/3/30 15:59
 **/
public interface IBeanConfigParser {
    List<BeanDefinition> parse(InputStream inputStream);
    List<BeanDefinition> parse(String configContent);
}
