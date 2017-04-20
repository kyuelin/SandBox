package dev.kyuelin.madm21;

import javax.annotation.Generated;
import java.util.Arrays;

/**
 * Created by linken on 4/19/17.
 */
public class Madm21Demo {

    public static final int max_cards=4;
    public static final int max_number=10;

    public boolean find21(int[] cards, Operator[] operators) {
        int result = cards[0];
        for (int i = cards.length; i>0; i--) {
            result = operators[i-1].operate(result, cards[i]);
            if (result == 21) {
                print_results(cards, operators);
                return true;
            }
        }
        return false;
    }

    private void print_results(int[] cards, Operator[] operators) {
        for (int i=0; i<cards.length-1; i++) {
            System.out.print(cards[i] + " " + operators[i].toString() + " ");
        }
        System.out.println(cards[cards.length-1] + "= 21");
    }

    public static void main(String[] args) {
        Madm21Demo demo = new Madm21Demo();
        int[] cards = new int[max_cards];
        Operator[] operators = new Operator[3];

        cards = new Generator().generateIntArray(cards.length, max_number);


    }

}
