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

        int iterCount = 0;

        for (int j=0;j<array.length - 1; j++) {
            boolean sorted = true;
            for (int i = 0; i < array.length - 1 - j; i++) {
                iterCount++;
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                }
            }
            if (sorted) break;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(iterCount);
    }

}


