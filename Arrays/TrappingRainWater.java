public class TrappingRainWater {
    public static void main(String[] args) {
        // int[] arr = {3,0,5};
        int[] arr = {1,2,3,4,5};
        int ans = getUnits(arr, 1,0);
        System.out.println(ans);
    }

    private static int getUnits(int[] arr, int i, int res) {
        if(i > arr.length-2){
            return res;
        }
        int min = arr[0];
        if(min > arr[arr.length-1]){
            min  = arr[arr.length-1];
        }
        if(res > 0){
             res = res + (min - arr[i]);
        }
        return getUnits(arr, i+1, res);
    }
}
