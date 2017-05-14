package dev.kyuelin.ruleengine.base;

import dev.kyuelin.ruleengine.domain.LoanApplication;

/**
 * Created by kennethlin on 5/14/17.
 */
public class MockLoanApplicationPersistence implements LoanApplicationPersistenceInterface {
    public void recordApproval(LoanApplication application) throws Exception {

    }

    public void recordRejection(LoanApplication application) throws Exception {

    }

    public void recordIncomplete(LoanApplication application) throws Exception {

    }
}
