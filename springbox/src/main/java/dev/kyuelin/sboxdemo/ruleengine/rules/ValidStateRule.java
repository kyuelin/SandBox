package dev.kyuelin.sboxdemo.ruleengine.rules;

import dev.kyuelin.sboxdemo.ruleengine.base.AbstractRule;
import dev.kyuelin.sboxdemo.ruleengine.model.LoanApplication;

import java.util.List;

/**
 * Created by kennethlin on 5/13/17.
 */
public class ValidStateRule extends AbstractRule {

    public void setStates(List states) {
        this.states = states;
    }

    private List states;

    protected boolean apply(Object obj) throws Exception {
        LoanApplication application = (LoanApplication) obj;
        if (states.contains(application.getStateCode())) {
            return true;
        }
        return false;
    }
}
