package run;


import java.util.Arrays;

/**
 * Created by Serhii_Myronenko on 6/25/2017.
 */
public class Runner {
    public static void main(String[] args) {

        // foreach
        int[] arrayofmine = {-13,3,5,2,4,-7,8,8,6,3,-9,1,-10};
//        for(int item : arrayofmine) {
//            System.out.println(item);
//        }
        //https://stackoverflow.com/questions/2154251/any-shortcut-to-initialize-all-array-elements-to-zero
        // fix the issue with the nullifing value of comparison
        int max_val =arrayofmine[0];
        int min_val = arrayofmine[0];
        int second_val = arrayofmine[0];
        int bigsum;
        System.out.println("stupid divider");
        for(int i = 1; i<arrayofmine.length; i++){
            // System.out.println(arrayofmine[i])
            //comparisson of the elements in the lazyarray
//            if (arrayofmine[i] >  max_val){
//                max_val = arrayofmine[i];
////                System.out.println("current max val is "+ max_val );
//            }

            if (arrayofmine[i] < min_val){
                min_val = arrayofmine[i];
//                System.out.println("current min val is "+ min_val );
            }


            //for maximum value look here for collections
            //https://stackoverflow.com/questions/1806816/java-finding-the-highest-value-in-an-array

            if (arrayofmine[i] >  max_val){
                second_val = max_val;
                max_val = arrayofmine[i];
                //System.out.println("current max val is "+ max_val );
                //System.out.println("current 2nd max val is "+ second_val );
            } else if (arrayofmine[i] > second_val) {
                second_val = arrayofmine[i];
                //System.out.println("current 2nd max val is "+ second_val );
            }

        }

        //get the sum of two maximum elements


        bigsum = second_val + max_val;
        // cheating here, now i will preint the array in form of string
        System.out.println("summ of two largest values without repeat is " + bigsum);
        System.out.println("current min val is "+ min_val + "\n" + "current max is " + max_val + "\n" +
                "current 2nd max is " + second_val + "\n");
        System.out.println(java.util.Arrays.toString(arrayofmine));




//        System.out.println("this is test print of lab2");
    }

    public static int twoBiggest(int[] array){
        if (array.length == 0)
            return 0;
        if(array.length == 1)
            return array[0];

        int max_val = array[0];
        int second_val = array[1];

            for(int i = 2; i<array.length; i++){
                if (array[i] >  max_val){
                    second_val = max_val;
                    max_val = array[i];
                } else if (array[i] > second_val) {
                    second_val = array[i];
                }
            }


        return max_val + second_val;
        // cheating here, now i will preint the array in form of string

    }


    public static int[] toSortminfirst(int[] array) {

        if (array.length == 0)
            return null;

        for(int i =0; i<array.length; i++){
            int min = array[i];
            int min_i = i;
            for(int j = i+1; j<array.length; j++){
                if (array[j]<min){
                    min=array[j];
                    min_i=j;
                }
            }
            if (i != min_i){
                int temp = array[i];
                array[i] = array[min_i];
                array[min_i] = temp;
            }
        }

        return array;
    }


    public static int[] toSortmaxlast(int[] array) {

        if (array.length == 0)
            return null;

        for (int i1 = 0; i1 < array.length; i1++) {
            int i = array[i1];

        }

        for(int i=array.length-1; i>0; i-- ){
            int max = array[i];
            int max_i = i;
            for(int j = i-1; j>=0; j--){
                if (array[j]>max){
                    max=array[j];
                    max_i=j;
                }
            }

            if (i != max_i){
                int temp = array[i];
                array[i] = array[max_i];
                array[max_i] = temp;
            }
        }

        return array;
    }


    // new comment for test of push
    public static int[] homeWork(int[] array) {

        int[] arrEven = {};
        int[] arrUnEven = {};

        if (array.length == 0)
            return null;

        for (int i = 0; 1 < array.length; i++) {
            int num = array[i];
            //lis
            if(num%2 == 0){

            }

        }

        for(int i=array.length-1; i>0; i-- ){
            int max = array[i];
            int max_i = i;
            for(int j = i-1; j>=0; j--){
                if (array[j]>max){
                    max=array[j];
                    max_i=j;
                }
            }

            if (i != max_i){
                int temp = array[i];
                array[i] = array[max_i];
                array[max_i] = temp;
            }
        }

        return array;
    }

}


