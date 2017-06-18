package dev.kyuelin.ruleengine.rules;

import dev.kyuelin.ruleengine.base.AbstractRule;
import dev.kyuelin.ruleengine.domain.LoanApplication;

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
