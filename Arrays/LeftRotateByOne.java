import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7};
        int[] arr = {-1,-100,3,99};
        int k = 2;
        int l = arr.length;
        k = k % l;
        reverse(arr,0,l-k-1);
        reverse(arr,l-k,l-1);
        reverse(arr,0,l-1);
        System.out.println(Arrays.toString(arr));
    }
    
    private static void  rotareByOne(int[] arr, int i, int j) {
        if(i > arr.length-1){
            arr[arr.length-1] = j;
            return ;
        }
        arr[i-1] = arr[i];

         rotareByOne(arr,i+1, j);
    }

    public static void reverse(int[] arr,int si, int ei){
        if(si > ei){
            return;
        }
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
         reverse(arr, si+1, ei-1);
    }
}
