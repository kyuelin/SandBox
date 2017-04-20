package dev.kyuelin.madm21;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by linken on 4/19/17.
 */
public class Generator {
    public int[] generateIntArray(int length, int range) {***
        int[] cards = new int[length];

        int[] numbers = new int[range + 1];

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int rnum = random.nextInt(range) + 1;
            while (numbers[rnum] == 1) {
                rnum = random.nextInt(range) + 1;
            }
            cards[i] = rnum;
            numbers[rnum] = 1;
        }
        System.out.println(Arrays.toString(cards));

        return cards;
    }

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(nbr -> new Generator().generateIntArray(4, 10));
    }

}
