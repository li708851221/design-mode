package com.study.designmode.create.factory.ruleconfigservice;

import com.study.designmode.create.factory.entity.RuleConfig;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2021/3/30 14:50
 **/
public interface IRuleConfigParser {

    RuleConfig parse(String configText);
}
