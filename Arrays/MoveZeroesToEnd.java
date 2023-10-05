import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {8,5,0,0,0,20};
        int n = arr.length;
        movesZeroesToEnd(arr,0,n,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void movesZeroesToEnd(int[] arr, int i, int n, int count) {
        if(i >= arr.length){
            return;
        }
        if(arr[i] != 0){
           int temp = arr[i];
           arr[i] = arr[count];
           arr[count] = temp;
           count = count + 1;
        }
       
        movesZeroesToEnd(arr, i+1, n,count);
    }
}
