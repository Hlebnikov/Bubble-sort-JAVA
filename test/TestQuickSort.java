import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Александр on 13.03.2016.
 */
public class TestQuickSort extends TestCase{
    public void testQuickSort(){
        int[] ar = {1,2,3,4};
        QuickSort.swap(ar,0,1);
        assertEquals("[2, 1, 3, 4]", Arrays.toString(ar));

        int[] arr = {0, 2, 5, 1, 3};
        QuickSort.sort(arr);
        assertEquals("[0, 1, 2, 3, 5]", Arrays.toString(arr));

        arr = new int[]{5, 3, 2, 1, 0};
        QuickSort.sort(arr);
        assertEquals("[0, 1, 2, 3, 5]", Arrays.toString(arr));

        arr = new int[]{0, 1, 2, 3, 5};
        QuickSort.sort(arr);
        assertEquals("[0, 1, 2, 3, 5]", Arrays.toString(arr));

        int[] array = new int[10];
        Random rand = new Random();
        for (int i=0; i<array.length; i++){
            array[i] = rand.nextInt()%25;
        }
        System.out.println(Arrays.toString(array));
        int[] sorted = QuickSort.sort(array);
        Arrays.sort(array);
        assertEquals(Arrays.toString(array),Arrays.toString(sorted));
    }
}
