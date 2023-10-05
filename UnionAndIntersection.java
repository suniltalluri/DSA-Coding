import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionAndIntersection {
    public static void main(String[] args) {
        // int[] arr1 = {1,1,1,2,2,3,3,3};
        // int[] arr2 = {3,3,3,4};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1,2,3};
        //----union----
        getUnion(arr1,arr2);
        //---Intersection---- with Duplicates..
        // getIntersecWithDuplicates(arr1,arr2);
    }
    private static void getIntersecWithDuplicates(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr2[j] < arr1[i]){
                j++;
            }else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(list);
    }
    public static void getUnion(int[] arr1, int[] arr2){

        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i < arr1.length || j < arr2.length){

            // Duplicates 
              while(i > 0 && i < arr1.length && arr1[i] == arr1[i-1]){
                i++;
              }
              while(j > 0 && j < arr2.length && arr2[j] == arr2[j-1]){
                j++;
              }
            // Array Exhaust
               if(i >= arr1.length){
                    list.add(arr2[j]);
                    j++;
                    continue;
               }
               if(j >= arr2.length){
                    list.add(arr1[i]);
                    i++;
                    continue;
               }
            // comparsion
               if(arr1[i] < arr2[j]){
                    list.add(arr1[i]);
                    i++;
               }else if(arr2[j] < arr1[i]){
                    list.add(arr2[j]);
                    j++;
               }else{
                    list.add(arr1[i]);
                    i++;
                    j++;
               }
        }
        System.out.println(list);
    }
}
