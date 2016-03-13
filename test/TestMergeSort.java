import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Александр on 13.03.2016.
 */
public class TestMergeSort extends TestCase {
    public void testMergeSort() {
        int[] ar1 = {1};
        int[] ar2 = {2};

        int[] merged = MergeSort.merge(ar1,ar2);
        StringBuffer out = new StringBuffer();
        for (int i : merged){
            out.append(i+" ");
        }
        assertEquals("1 2 ", out.toString());

/////////
        ar1 = new int[]{1, 5, 7};
        ar2 = new int[]{2, 3, 8};

        merged = MergeSort.merge(ar1,ar2);
        out = new StringBuffer();
        for (int i : merged){
            out.append(i+" ");
        }
        assertEquals("1 2 3 5 7 8 ", out.toString());
        //*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
        int[] array1 = {2, 3, 4, 7, 10, 2, 0, -3, 5, 34};
        int[] array2  = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] sorted = MergeSort.sort(array1);
        out = new StringBuffer();
        for (int i : sorted) {
            out.append(i+" ");
        }
        assertEquals("-3 0 2 2 3 4 5 7 10 34 ", out.toString());




        final Random random = new Random();

        array1 = new int[10000];
        for (int i=0; i<array1.length; i++){
            array1[i] = random.nextInt();
        }
        long startTime = System.nanoTime();
        sorted = MergeSort.sort(array1);
        long timeLeft = System.nanoTime()-startTime;
        System.out.println("time = "+(double)timeLeft/1000000+"ms");

        startTime = System.nanoTime();
        Arrays.sort(array1);
        timeLeft = System.nanoTime()-startTime;
        System.out.println("time of standart sort: "+(double)timeLeft/1000000+"ms");

        out = new StringBuffer();
        for (int i : sorted) {
            out.append(i+" ");
        }
        StringBuffer expected = new StringBuffer();
        for (int item : array1){
            expected.append(item+ " ");
        }

        assertEquals(expected.toString(), out.toString());
    }
}
