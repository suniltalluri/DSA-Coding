import java.util.ArrayList;

public class NumSubset {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); 
         ArrayList<Integer> cur = new ArrayList<>(); 
         getSubset(arr, cur,0, ans);
         System.out.println(ans); 
        }
        private static void getSubset(int[] arr, ArrayList<Integer> cur, int start, ArrayList<ArrayList<Integer>> ans) {
            ans.add(new ArrayList<>(cur));
            for(int i = start ; i < arr.length; i++){
                // System.out.println(ans); 
                cur.add(arr[i]);
                
                getSubset(arr, cur, i+1, ans);
                
                cur.remove(cur.size()-1);
        }
        
    }
}
