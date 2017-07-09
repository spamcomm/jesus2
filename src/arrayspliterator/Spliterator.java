package arrayspliterator;

/**
 * Created by Serhii_Myronenko on 7/9/2017.
 */
public class Spliterator {

    public TwoArraysDTO splitArray(int[] array) {

        int uneven_cnt = 0;
        int even_cnt = 0;

        for (int cnt = 0; cnt < array.length; cnt++) {
            int iterator = array[cnt];

            if (iterator % 2 == 0) {
                even_cnt++;
            }
            if (iterator % 2 != 0) {
                uneven_cnt++;
            }

        }

        int[] evenArr = new int[even_cnt];
        int[] unevenArr = new int[uneven_cnt];

        uneven_cnt = 0;
        even_cnt = 0;

        for (int cnt = 0; cnt < array.length; cnt++) {
            int iterator = array[cnt];

            if (iterator % 2 == 0) {
                evenArr[even_cnt] = iterator;
                even_cnt++;
            }
            if (iterator % 2 != 0) {
                unevenArr[uneven_cnt] = iterator;
                uneven_cnt++;
            }
        }


        return createTwoArraysDTO(evenArr, unevenArr);
    }


    public TwoArraysDTO createTwoArraysDTO(int[] evenArray, int[] unevenArray) {

        TwoArraysDTO passArays = new TwoArraysDTO();

        passArays.concatArrays(evenArray, unevenArray);

        return passArays;
    }
}
