public class LSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int target  = 5;
        int ans = getLongestSubArray(arr,target);
        System.out.println(ans);
    }

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
}