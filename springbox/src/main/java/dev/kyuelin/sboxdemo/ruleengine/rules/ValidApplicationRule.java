package dev.kyuelin.sboxdemo.ruleengine.rules;

import dev.kyuelin.sboxdemo.ruleengine.base.AbstractRule;
import dev.kyuelin.sboxdemo.ruleengine.model.LoanApplication;

/**
 * Created by kennethlin on 5/13/17.
 */
public class ValidApplicationRule extends AbstractRule {
    protected boolean apply(Object obj) throws Exception {
        LoanApplication application = (LoanApplication) obj;
        if(application.getExpences() == 0 ||
                application.getFirstName() == null ||
                application.getIncome() == 0 ||
                application.getLastName() == null ||
                application.getStateCode() == null) {
            application.setStatus(LoanApplication.INSUFFICIENT_DATA);
            return false;
        }
        return true;
    }
}
