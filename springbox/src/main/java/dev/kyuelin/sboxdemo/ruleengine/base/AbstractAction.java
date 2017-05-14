package dev.kyuelin.sboxdemo.ruleengine.base;

/**
 * Created by kennethlin on 5/13/17.
 */
public abstract class AbstractAction extends AbstractComponent {

    private AbstractComponent nextStep;

    public void execute(Object obj) throws Exception {
        this.doExecute(obj);
        if(null != nextStep) {
            nextStep.execute(obj);
        }
    }

    protected abstract void doExecute(Object obj) throws Exception;

    public AbstractComponent getNextStep() {
        return nextStep;
    }

    public void setNextStep(AbstractComponent nextStep) {
        this.nextStep = nextStep;
    }
}
