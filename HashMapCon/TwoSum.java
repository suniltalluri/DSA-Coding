import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        // int[] arr = {2,7,11,15};
        int[] arr = {2,3,7,9,10};
         boolean answ = getTwoSumIsTrue(arr,11);
        int[] ans = getTwoSum(arr,11);
        System.out.println(Arrays.toString(ans));
        System.out.println(answ);
        
    }
    
    private static int[] getTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2]; 
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int more = target - num ;
            if(map.containsKey(more)){
                res[1] = i;
                res[0] = map.get(more);
            }
            map.put(arr[i], i);
        }
        System.out.println(map.entrySet());
        return res;
    }

    private static boolean getTwoSumIsTrue(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2]; 
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int more = target - num ;
            if(map.containsKey(more)){
                return true;
            }
            map.put(arr[i], more);
        }
        return false;
    }
}
