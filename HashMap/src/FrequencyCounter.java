
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;

public class FrequencyCounter {
    public static void main(String[] args) {
        int []  arr = {1,2,3,2,2,4,2,1,5,4,3,3,5};

      Map<Integer,Integer> FreqMap = Counting(arr);

        FreqMap.forEach((mey, value) ->
                System.out.println("Element: " + mey + ", Frequency: " + value)
        );
    }

    static Map<Integer, Integer> Counting (int arr[]){
        Map<Integer, Integer> Freqmap = new LinkedHashMap<>();


        for (int i = 0; i<arr.length; i++){
             int key = arr[i];
             Freqmap.put(key,Freqmap.getOrDefault(key,0)+1);
        }
        return Freqmap;
    }
}
