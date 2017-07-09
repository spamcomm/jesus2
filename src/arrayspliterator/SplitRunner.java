package arrayspliterator;

import java.util.Arrays;

/**
 * Created by Serhii_Myronenko on 7/9/2017.
 */
public class SplitRunner {
    public static void main(String[] args) {
        Spliterator runSplit = new Spliterator();

        TwoArraysDTO twoArraysDTO = runSplit.splitArray(new int[]{1, 2, 3, 4});

        System.out.println(Arrays.toString(twoArraysDTO.evenarray));
        System.out.println(Arrays.toString(twoArraysDTO.unevenarray));

    }
}
