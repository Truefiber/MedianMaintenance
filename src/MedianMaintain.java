import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Gennadiy on 11.06.2014.
 */
public class MedianMaintain {
    long median;
    List<Long> source;

    public MedianMaintain() {
    }

    public int findMedian(String file){


        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String nextLine;
            source = new ArrayList<Long>();
            median = 0;
            int index = 1;

            while (!((nextLine = reader.readLine())== null)){
                source.add(Long.parseLong(nextLine));
                sumUpMedian(index);
                index++;
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }



        return (int)(median % 10000);
    }

    private void sumUpMedian(int index) {
        Collections.sort(source);
        if ((index % 2) == 0) {
            median = median + source.get((index / 2) - 1);
        } else {
            median = median + source.get(index / 2);
        }

    }
}
