public class OneConsecutive {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int ans = oneConsecutive(arr,0,0);
        System.out.println(ans);
    }

    private static int oneConsecutive(int[] arr, int i, int res) {
        if(i>arr.length-1){
            return res;
        }
        res = res ^ arr[i];
        return oneConsecutive(arr, i+1, res);
    }
}
