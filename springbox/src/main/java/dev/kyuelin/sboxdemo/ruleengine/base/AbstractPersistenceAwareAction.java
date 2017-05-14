package dev.kyuelin.sboxdemo.ruleengine.base;

/**
 * Created by kennethlin on 5/13/17.
 */
public abstract class AbstractPersistenceAwareAction extends AbstractAction {
    private LoanApplicationPersistenceInterface persistenceService;

    public LoanApplicationPersistenceInterface getPersistenceService() {
        return persistenceService;
    }

    public void setPersistenceService(LoanApplicationPersistenceInterface persistenceService) {
        this.persistenceService = persistenceService;
    }
}
