package dev.kyuelin.ruleengine.base;

import dev.kyuelin.ruleengine.domain.LoanApplication;

/**
 * Created by kennethlin on 5/13/17.
 */
public interface LoanApplicationPersistenceInterface {
    public void recordApproval(LoanApplication application) throws Exception;
    public void recordRejection(LoanApplication application) throws Exception;
    public void recordIncomplete(LoanApplication application) throws Exception;
}
