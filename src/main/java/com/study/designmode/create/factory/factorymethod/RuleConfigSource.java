package com.study.designmode.create.factory.factorymethod;

import com.study.designmode.create.factory.entity.RuleConfig;
import com.study.designmode.create.factory.ruleconfigservice.IRuleConfigParser;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2021/3/30 15:08
 **/

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws Exception{
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        IRuleConfigParser parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new Exception("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        String configText="";
        RuleConfig ruleConfig = parserFactory.parse(configText);

        //从ruleConfigFilePath文件中读取配置文本到configText中
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}


