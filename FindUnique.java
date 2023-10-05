import java.util.ArrayList;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,4,7,2,7,4,0};
        getUnique(arr);
    }

     static void getUnique(int[] arr) {
        int res = 0;
       for (int i : arr) {
            res = res ^ i;
        }
        System.out.println(res);
        
    }

    static void isUnique(int[] arr){
        ArrayList newArr = new ArrayList<>();
        
    }
}
