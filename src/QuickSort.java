import java.util.Arrays;

/**
 * Created by Александр on 13.03.2016.
 */
public class QuickSort {
    public static int[] sort(int[] in){

        partitition(in,0,in.length-1);

        return in;
    }

    public static void partitition(int[] in, int left, int right){
        System.out.println(left + " " + right);
        if (left>=right) return;

        int middle = (left+right)/2;
        System.out.println(" mid="+ middle);
        int pivot = in[middle];

        int cur = left;
        swap(in,middle,right);
        for (int i=left; i<=right; i++){
            if (in[i] <= pivot) swap(in,i,cur++);
        }

        if (right-left==1) return;
        partitition(in, left, cur-1);
        System.out.println(Arrays.toString(in));
        partitition(in, cur, right);
        System.out.println(Arrays.toString(in));
    }

    public static void swap(int[] in, int first, int second){
        int t = in[first];
        in[first] = in[second];
        in[second] = t;
    }
}
