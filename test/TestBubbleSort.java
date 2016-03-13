import junit.framework.TestCase;

/**
 * Created by Александр on 13.03.2016.
 */
public class TestBubbleSort extends TestCase {
    public void testBubbleSort(){
        int[] array = {2, 3, 4, 7, 10, 2, 0, -3, 5, 34};
        int[] sorted = BubbleSort.sort(array);
        StringBuffer out = new StringBuffer();
        for (int i : sorted) {
            out.append(i+" ");
        }
        assertEquals("-3 0 2 2 3 4 5 7 10 34 ", out.toString());

        int[] array2  = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        sorted = BubbleSort.sort(array2);
        out = new StringBuffer();
        for (int i : sorted) {
            out.append(i+" ");
        }
        assertEquals("0 1 2 3 4 5 6 7 8 9 ", out.toString());
    }
}
