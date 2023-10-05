import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        // int[] arr = {0, 2, 1, 2, 0};
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        Divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void Divide(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }        
        int mid = si + (ei - si)/2;
        Divide(arr, si, mid);
        Divide(arr, mid+1, ei);
        Conqure(arr, si, mid, ei);
    }

    public static void Conqure(int[] arr, int si, int mid, int ei){
        int[] merged = new int[ei - si + 1];
        int x = 0;
        int idx1 = si;
        int idx2 = mid+1;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }else{
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while(idx1 <= mid){
             merged[x] = arr[idx1];
                x++;
                idx1++;
        }

        while(idx2 <= ei){
             merged[x] = arr[idx2];
                x++;
                idx2++;
        }

        for (int i = 0, j = si; i < merged.length; i++,j++) {
            arr[j] = merged[i];
        }
        // System.out.println(Arrays.toString(merged)); 
    }
}
