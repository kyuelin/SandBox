package dev.kyuelin.sboxdemo.ruleengine;

import dev.kyuelin.sboxdemo.ruleengine.base.SpringRuleEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kennethlin on 5/13/17.
 */
public class LoanProcessRuleEngine extends SpringRuleEngine {
    public static final SpringRuleEngine getEngine(String name) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringRuleEngineContext");
        return (SpringRuleEngine) context.getBean(name);
    }
}
