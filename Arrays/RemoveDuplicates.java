import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,6,6,8};
        int[] res = new int[arr.length];
        int size = arr.length;
        int ans = removeDuplicates(arr,1, size,res);
        // System.out.println(Arrays.toString(ans));
        System.out.println(ans);
    }
    
    private static int removeDuplicates(int[] arr, int i, int size, int[] res) {
        // System.out.println(size);
        
        if(i > arr.length-1){
            return size;
        }
        if(arr[i] == arr[i-1]){
            // arr[size-1] = arr[i-1];
            size--;
        }
        return removeDuplicates(arr, i+1, size, res);
    }
}
