package dev.kyuelin.ruleengine.base;

/**
 * Created by kennethlin on 5/13/17.
 */
public abstract class AbstractRule extends AbstractComponent {

    private AbstractComponent positiveAbstractComponent;
    private AbstractComponent negativeAbstractComponent;

    public void execute(Object obj) throws Exception{
        boolean result = apply(obj);
        if (result == true) {
            positiveAbstractComponent.execute(obj);
        }
        else {
            negativeAbstractComponent.execute(obj);
        }
    }

    protected abstract boolean apply(Object obj) throws Exception;

    public AbstractComponent getPositiveAbstractComponent() {
        return positiveAbstractComponent;
    }

    public void setPositiveAbstractComponent(AbstractComponent positiveAbstractComponent) {
        this.positiveAbstractComponent = positiveAbstractComponent;
    }

    public AbstractComponent getNegativeAbstractComponent() {
        return negativeAbstractComponent;
    }

    public void setNegativeAbstractComponent(AbstractComponent negativeAbstractComponent) {
        this.negativeAbstractComponent = negativeAbstractComponent;
    }

}
