package arrayspliterator;

/**
 * Created by Serhii_Myronenko on 7/9/2017.
 */
public class TwoArraysDTO {
    public int[] evenarray;
    public int[] unevenarray;

    public void concatArrays (int[] even, int[] uneven){
        evenarray = even;
        unevenarray = uneven;
    }
}

