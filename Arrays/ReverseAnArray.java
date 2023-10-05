import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] reverseArray(int[] arr, int sin, int ein) {
        if(sin > ein){
            return arr;
        }
        int temp = arr[sin];
        arr[sin] = arr[ein];
        arr[ein] = temp;
        return reverseArray(arr, sin+1, ein-1);
    }
}
