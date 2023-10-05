import java.util.ArrayList;
import java.util.List;

public class IntSubset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        // List<Integer> temp = new ArrayList<>();
        printSubsets(arr,list, new ArrayList<>(), 0);
        System.out.println(list);
    }

    private static void printSubsets(int[] arr, List<List<Integer>> list, 
    List<Integer> temp, int start) {
        list.add(new ArrayList<>(temp));
        for(int i = start; i < arr.length; i++){
            temp.add(arr[i]);
            printSubsets(arr, list, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
