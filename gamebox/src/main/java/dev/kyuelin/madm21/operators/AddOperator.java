package dev.kyuelin.madm21.operators;

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

    /**
     * Created by linken on 4/19/17.
     */
    public static class DivideOperator implements Operator {
        @Override
        public String toString() {
            return "/";
        }

        @Override
        public int operate(int op1, int op2) {
            return (op1%op2==0)?op1/op2:Integer.MAX_VALUE;
        }
    }
}
