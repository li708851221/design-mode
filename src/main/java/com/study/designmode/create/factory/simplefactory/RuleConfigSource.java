package com.study.designmode.create.factory.simplefactory;

import com.study.designmode.create.factory.entity.RuleConfig;
import com.study.designmode.create.factory.ruleconfigservice.*;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2021/3/29 11:26
 **/

    public class RuleConfigSource {
        public RuleConfig load(String ruleConfigFilePath) throws Exception {
            String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
            IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
            if (parser == null) {
                throw new Exception(
                        "Rule config file format is not supported: " + ruleConfigFilePath);
            }

            String configText = "";
            //从ruleConfigFilePath文件中读取配置文本到configText中
            RuleConfig ruleConfig = parser.parse(configText);
            return ruleConfig;
        }

        private String getFileExtension(String filePath) {
            //...解析文件名获取扩展名，比如rule.json，返回json
            return "json";
        }

    }


