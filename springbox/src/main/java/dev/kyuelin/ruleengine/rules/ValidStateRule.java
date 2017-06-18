package dev.kyuelin.ruleengine.rules;

import dev.kyuelin.ruleengine.base.AbstractRule;
import dev.kyuelin.ruleengine.domain.LoanApplication;

import java.util.List;

/**
 * Created by kennethlin on 5/13/17.
 */
public class ValidStateRule extends AbstractRule {

    public void setValidStates(List validStates) {
        this.validStates = validStates;
    }

    private List validStates;

    protected boolean apply(Object obj) throws Exception {
        LoanApplication application = (LoanApplication) obj;
        if (validStates.contains(application.getStateCode())) {
            return true;
        }
        return false;
    }
}
