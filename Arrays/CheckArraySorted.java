public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,0,9,10};
        // int[] arr = {10,5,20,40};
        boolean ans = isSorted(arr, 1,true);
        System.out.println(ans);
    }

    private static boolean isSorted(int[] arr, int i, boolean res) {
        if(i > arr.length-1){
            return res;
        }
        if(arr[i] < arr[i-1] ){
            return false;
        }
        // temp = arr[i];
        return isSorted(arr, i+1, res);
    }
}
