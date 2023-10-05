import java.util.Arrays;

public class swapAlternativeEl {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        swapAlternative(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swapAlternative(int[] arr){
        int i = 0;
        int j = 1;
        int size = arr.length-1;
        while(i+1 < size){
            swap(arr,i,j);
            i = 2 + i;
            j = 2 + j;
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
