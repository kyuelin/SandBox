package dev.kyuelin.ruleengine.base;

/**
 * Created by kennethlin on 5/13/17.
 */
public class SpringRuleEngine {

    public AbstractComponent getFirstStep() {
        return firstStep;
    }

    public void setFirstStep(AbstractComponent firstStep) {
        this.firstStep = firstStep;
    }

    private AbstractComponent firstStep;

    public void processRequest(Object obj) throws Exception {
        firstStep.execute(obj);
    }
}
