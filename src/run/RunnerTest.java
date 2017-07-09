package run;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Serhii_Myronenko on 6/25/2017.
 */
public class RunnerTest {

    @Test
    public void one() {
        int result = Runner.twoBiggest(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        assertEquals(17, result);
    }

    @Test
    public void two() {
        int result = Runner.twoBiggest(new int[]{1, 1});
        assertEquals(2, result);
    }

    @Test
    public void three() {
        int result = Runner.twoBiggest(new int[]{3, 2});
        assertEquals(5, result);
    }

    @Test
    public void four() {
        int result = Runner.twoBiggest(new int[]{-1, -20, -30});
        assertEquals(-21, result);
    }

    @Test
    public void five() {
        int result = Runner.twoBiggest(new int[]{1, 2, 3, 4, 5, 9, 6, 7, 6, 7, 8, 9});
        assertEquals(18, result);
    }

    @Test
    public void six() {
        int result = Runner.twoBiggest(new int[]{0, 0, 9});
        assertEquals(9, result);
    }

    @Test
    public void seven() {
        int result = Runner.twoBiggest(new int[]{-90, -90, -9, -1, 30, 20, 100, 0});
        assertEquals(130, result);
    }

    @Test
    public void eight() {
        int result = Runner.twoBiggest(new int[]{-90});
        assertEquals(-90, result);
    }
    @Test
    public void nine() {
        int result = Runner.twoBiggest(new int[]{20,1,1});
        assertEquals(21, result);
    }

    @Test
    public void ten() {
        int result = Runner.twoBiggest(new int[]{0,0});
        assertEquals(0, result);
    }

    @Test
    public void eleven() {
        int result = Runner.twoBiggest(new int[]{});
        assertEquals(0, result);
    }
    @Test
    public void twelve() {
        int result = Runner.twoBiggest(new int[]{-1,-1,-2,14});
        assertEquals(13, result);
    }

    @Test
    public void thirteen() {
        int[] result = Runner.toSortminfirst(new int[]{-1,-1,-2,14});
        assertArrayEquals(new int[]{-2, -1, -1, 14}, result);
    }


    @Test
    public void fourteen() {
        int[] result = Runner.toSortminfirst(new int[]{-1,-1,-2,14,0,-15,16,25});
        assertArrayEquals(new int[]{-15,-2, -1, -1, 0, 14, 16, 25}, result);
    }

    @Test
    public void sixteen() {
        int[] result = Runner.toSortmaxlast(new int[]{-1,-1,-2,14});
        for (int i : result) {
            System.out.print(i+" ");
        }
        assertArrayEquals(new int[]{-2, -1, -1, 14}, result);
    }


    @Test
    public void seventeen() {
        int[] result = Runner.toSortmaxlast(new int[]{-1,-1,-2,14,0,-15,16,25});
        assertArrayEquals(new int[]{-15,-2, -1, -1, 0, 14, 16, 25}, result);
    }

}