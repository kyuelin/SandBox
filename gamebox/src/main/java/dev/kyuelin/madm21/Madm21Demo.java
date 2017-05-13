package dev.kyuelin.madm21;

import dev.kyuelin.madm21.operators.AddOperator;
import dev.kyuelin.madm21.operators.MinusOperator;
import dev.kyuelin.madm21.operators.MultiplyOperator;
import dev.kyuelin.madm21.operators.Operator;
import dev.kyuelin.madm21.utils.Generator;

import java.util.stream.IntStream;

/**
 * Created by linken on 4/19/17.
 */
public class Madm21Demo {

    private static final int max_cards = 4;
    private static final int max_number = 10;
    private static final int max_operators = 4;
    private static final int TWENTY_ONE = 21;

    public boolean find21(int[] cards, Operator[] operators) {
        int[] temp_cards = new int[cards.length];

        for (int i = 0; i < max_cards; i++) {
            temp_cards[0] = cards[i];
            for (int j = 0; j < max_cards; j++) {
                if (!(j == i)) {
                    temp_cards[1] = cards[j];
                    for (int k = 0; k < max_cards; k++) {
                        if (!(k == i || k == j)) {
                            temp_cards[2] = cards[k];
                            for (int l = 0; l < max_cards; l++) {
                                if (!(l == i || l == j || l == k)) {
                                    temp_cards[3] = cards[l];
                                    //System.out.println(cards[i] + ":" + cards[j] + ":" + cards[k] + ":" + cards[l]);

                                    if (calculate21(temp_cards, operators)) {
                                        return true;
                                    }


                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean calculate21(int[] temp_cards, Operator[] operators) {
        Operator[] ops = new Operator[3];
        for (int m = 0; m < max_operators; m++) {
            ops[0] = operators[m];
            for (int n = 0; n < max_operators; n++) {
                ops[1] = operators[n];
                for (int o = 0; o < max_operators; o++) {
                    ops[2] = operators[o];
                    int result = temp_cards[0];
                    for (int q = 1; q < max_cards; q++) {
                        result = ops[q - 1].operate(result, temp_cards[q]);
                      //  System.out.println("["+result+":"+ops[q-1]+":"+temp_cards[q]);
                    }
                    //print_results(temp_cards, ops, result);
                    if (result == TWENTY_ONE) {
                        print_results(temp_cards, ops, result);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void print_results(int[] cards, Operator[] operators, int result) {
        for (int i = 0; i < cards.length - 1; i++) {
            System.out.print(cards[i] + " " + operators[i].toString() + " ");
        }
        System.out.println(cards[cards.length - 1] + " = " + result);
    }

    public static void main(String[] args) {
        Madm21Demo demo = new Madm21Demo();

        Operator[] operators = {new MinusOperator(), new AddOperator(), new AddOperator.DivideOperator(), new MultiplyOperator()};

        IntStream.range(1, 100000).forEach(nbr ->
                demo.find21(Generator.generateIntArray(max_cards, max_number), operators));
/*
        int[] cards = {10,10,1,4};
        demo.find21(cards, operators);
*/
    }

}
