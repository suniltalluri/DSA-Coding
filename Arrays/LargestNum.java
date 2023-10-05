public class LargestNum {
    public static void main(String[] args) {
        int[] arr = {66,76,23,54,2,105};
        // int[] arr = {10,10,10};
        // int ans = getLargestNum(arr,arr[0],0);
        int ans = getSecoundLargest(arr,1,-1,0);
        System.out.println(ans);
    }

     
// in one loop getting large and second large.......
    private static int getSecoundLargest(int[] arr, int i, int res, int large) {
    
        if(i >= arr.length){
            return arr[res];
        }

        if(arr[i] > arr[large]){
            res = large;
            large = i;
        }
        else if(arr[i] != arr[large]){
            if(arr[i] > arr[res]){
                res = i;
            }
        }
        return getSecoundLargest(arr, i+1, res, large);
    }

    //fing large num ....
    private static int getLargestNum(int[] arr, int large, int i) {
        if(i > arr.length-1){
            return large;
        }
        if(large <= arr[i]){
            large = arr[i];
        }
        return getLargestNum(arr, large, i+1);
    }
}
