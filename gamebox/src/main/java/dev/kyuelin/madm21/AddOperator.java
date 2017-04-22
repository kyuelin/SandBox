package dev.kyuelin.madm21;

/**
 * Created by linken on 4/19/17.
 */
public class AddOperator implements Operator {
    @Override
    public int operate(int op1, int op2) {
        return op1+op2;
    }

    @Override
    public String toString() {
        return "+";
    }
}
