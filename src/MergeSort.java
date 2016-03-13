import java.util.Arrays;

/**
 * Created by Александр on 13.03.2016.
 */
public class MergeSort {
    public static int[] sort(int[] in){
        if (in.length==1) return in;

        int middle = new Integer(in.length/2);
        int[] left = new int[middle];
        for (int i=0; i<middle; i++) left[i]=in[i];

        int[] right = new int[in.length-middle];
        for (int i=middle, j=0; i<in.length; i++,j++) right[j] = in[i];

        in = merge(sort(left),sort(right));
        return in;
    }

    public static int [] merge(int[] left, int[] right){
        int[] out = new int[left.length+right.length];
        int l = 0, r = 0;
        for (int i=0; i<out.length; i++){
            if (r<right.length && l<left.length)
                if (left[l] < right[r]) {
                    out[i] = left[l++];
                } else {
                    out[i] = right[r++];
                }
            else {
                if (l<left.length) out[i] = left[l++];
                else out[i] = right[r++];
            }
        }
        return out;
    }
}
