import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Александр on 24.02.2016.
 */
public class BubbleSort {
    public static void main(String... args){
        Path file = Paths.get("src/input.txt");
        String line = null;
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            line = reader.readLine();
        } catch (IOException e) {
            System.err.format("IOException: %s%n",e);
        }
        System.out.println(line);
        String[] items = line.split(" ");
        int[] array = new int[items.length];
        for (int i = 0; i < items.length; i++){
            array[i] = Integer.parseInt(items[i]);
        }

        int[] sorted = new int[array.length];
        sorted = BubbleSort.sort(array);


        for (int i : sorted) {
            System.out.print(i + " ");
        }
//        System.out.println();
//        System.out.println(iterCount);
    }

    public static int[] sort(int[] in){
//        int iterCount = 0;

        for (int j=0;j<in.length - 1; j++) {
            boolean sorted = true;
            for (int i = 0; i < in.length - 1 - j; i++) {
//                iterCount++;
                if (in[i] > in[i + 1]) {
                    sorted = false;
                    int t = in[i];
                    in[i] = in[i + 1];
                    in[i + 1] = t;
                }
            }
            if (sorted) break;
        }
        return in;
    }

}


