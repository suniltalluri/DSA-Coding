public class StockBuySell_1 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,12};
        // int[] arr = {1,5,3,1,2,8};
        int n = arr.length;
        int ans = getHighProfit(arr,1, 0 );
        System.out.println(ans);
    }

    private static int getHighProfit(int[] arr, int i, int res) {
        if(i >= arr.length){
            return res;
        }
       
        if(arr[i] > arr[i-1]){
            res  = res + (arr[i] - arr[i-1]);
        }
        
        
        return getHighProfit(arr, i+1, res);
    }
}
