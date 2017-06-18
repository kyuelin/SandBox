package dev.kyuelin.ruleengine;

import dev.kyuelin.ruleengine.base.SpringRuleEngine;
import dev.kyuelin.ruleengine.configs.RuleEngineConfig;
import dev.kyuelin.ruleengine.domain.LoanApplication;
import dev.kyuelin.utils.ContextUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kennethlin on 5/14/17.
 */
public class RuleEngineMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =null;
        context = new ClassPathXmlApplicationContext("ruleengine/SpringRuleEngineContext.xml");

        startEngine(context);
    }

    private static void startEngine(ClassPathXmlApplicationContext context) {
        ContextUtils.getContext(context, new Class[] {RuleEngineConfig.class});
        SpringRuleEngine engine = (SpringRuleEngine) context.getBean("SharkysExpressLoansApplicationProcessor");
        LoanApplication application = new LoanApplication();
        application.setFirstName("John");
        application.setLastName("Doe");
        application.setStateCode("TX");
        application.setExpences(4500);
        application.setIncome(7000);
        try {
            engine.processRequest(application);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
