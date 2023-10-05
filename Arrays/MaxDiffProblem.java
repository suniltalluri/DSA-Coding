public class MaxDiffProblem {
    public static void main(String[] args) {
        // int[] arr = {2,3,10,6,4,8,1};
        int[] arr = {7,9,5,6,3,2};
        // int[] arr = {10,20,30};
        int ans = getMaxDiff(arr, 1,arr[1] - arr[0], arr[0]);
        System.out.println(ans);
    }

    private static int getMaxDiff(int[] arr, int i, int res, int minVal) {
        if(i > arr.length-1){
            return res;
        }
        if(arr[i] > arr[i-1]){
            int diff = arr[i] - minVal;
            if(diff > res){
                res  = diff;
            }
            if(minVal > arr[i]){
                minVal = arr[i];
            }
        }
        return getMaxDiff(arr, i+1, res, minVal);
    }
}
