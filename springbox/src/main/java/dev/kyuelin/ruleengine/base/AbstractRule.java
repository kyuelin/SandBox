package dev.kyuelin.ruleengine.base;

/**
 * Created by kennethlin on 5/13/17.
 */
public abstract class AbstractRule extends AbstractComponent {

    private AbstractComponent positiveOutcomeStep;
    private AbstractComponent negativeOutcomeStep;

    public void execute(Object obj) throws Exception{
        boolean result = apply(obj);
        if (result == true) {
            positiveOutcomeStep.execute(obj);
        }
        else {
            negativeOutcomeStep.execute(obj);
        }
    }

    protected abstract boolean apply(Object obj) throws Exception;

    public void setPositiveOutcomeStep(AbstractComponent positiveOutcomeStep) {
        this.positiveOutcomeStep = positiveOutcomeStep;
    }

    public void setNegativeOutcomeStep(AbstractComponent negativeOutcomeStep) {
        this.negativeOutcomeStep = negativeOutcomeStep;
    }
}
