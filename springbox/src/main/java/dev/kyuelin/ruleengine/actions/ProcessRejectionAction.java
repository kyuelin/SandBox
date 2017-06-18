package dev.kyuelin.ruleengine.actions;

import dev.kyuelin.ruleengine.base.AbstractPersistenceAwareAction;
import dev.kyuelin.ruleengine.domain.LoanApplication;

/**
 * Created by kennethlin on 5/13/17.
 */
public class ProcessRejectionAction extends AbstractPersistenceAwareAction {

    protected void doExecute(Object obj) throws Exception {
        LoanApplication application = (LoanApplication) obj;
        if(LoanApplication.INSUFFICIENT_DATA.equals(application.getStatus()))
            this.getPersistenceService().recordIncomplete(application);
        else
            this.getPersistenceService().recordRejection(application);
    }
}
