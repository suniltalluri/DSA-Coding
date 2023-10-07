import java.util.HashMap;
import java.util.Map;

public class LSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1};
        // int[] arr = {2,0, 0, 3};
        int target  = 1;
        // int ans = getLongestSubArray(arr,target);
        int ans  = getLonsubArray(arr, target);
        System.out.println(ans);
    }

    // when array has only Positives nums....
    private static int getLongestSubArray(int[] arr, int target) {
        int len = 0;
        int sum = arr[0];
        int n = arr.length;
        int i = 0;
        int j = 0;
       while(j < n){
        while(sum > target && i < j){
            sum -= arr[i];
            i++;
        }
        if(sum == target){
            len = Math.max(len, j - i +1);
        }
        if(j < n){
            sum += arr[j];
        }

        j++;
       }
        return len;
       
    }
   
   // whem array has positives, zeroes and negitives....
    private static int getLonsubArray(int[] arr, int target){
        int len = 0;
        int n = arr.length;
        int prifixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n;i++){

            prifixSum += arr[i];

            if(prifixSum == target){
                len = Math.max(len,i +1);
            }

            int rem = prifixSum - arr[i];

            if(map.containsKey(rem)){
                len = Math.max(len,i - map.get(rem));
            }
            if(!map.containsKey(rem)){

                map.put(prifixSum, i);
            }

        }
        // System.out.println(map);
        return len;
    }
}