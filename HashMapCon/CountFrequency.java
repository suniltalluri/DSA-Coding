import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
     public static void main(String[] args) {
        // int[] arr = {1,3,6,10,3,2,6,10};
        int[] arr = {10,5,10,15,10,5};
        HashMap<Integer, Integer> map = new HashMap<>();
        getFrequency(arr, map,0,0);
        // getHighLowcount(arr,map);
        System.out.println(map);
    }

    private static void getHighLowcount(int[] arr, HashMap<Integer, Integer> map) {
        // for (Map.entrySet<Integer, Integer>) entry :  map.entrySet() {
            int min = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(min )
             
            System.out.println(entry.getValue());
        }

    }

    private static void getFrequency(int[] arr, HashMap<Integer, Integer> map) {
        for(int i = 0; i<arr.length; i++){
            int val = 1;
            if(map.containsKey(arr[i])){
                 val = val + map.get(arr[i]);
                 if(val < )
                map.put(arr[i], val  );
            }
            map.put(arr[i],val);
        }
    }
}
