import java.util.HashSet;
import java.util.Set;

public class Unionaray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2= {1,2,3,4,5,6,7};
         Set<Integer>  ans = getunion(arr1, arr2,0,0);
         System.out.println(ans);
    }

    private static Set<Integer> getunion(int[] arr1, int[] arr2, int i, int j) {
        Set<Integer> res = new HashSet<>();
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                if(!res.contains(arr1[i]) || res.size() == 0){
                    res.add(arr1[i]);
                    
                }
                i++;
            }else{
                if(!res.contains(arr2[j]) || res.size() == 0){
                    res.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<arr1.length){
             if(!res.contains(arr1[i]) || res.size() == 0){
                    res.add(arr1[i]);   
                }
                i++;
        }
        while(j<arr2.length){
            if(!res.contains(arr2[j]) || res.size() == 0){
                    res.add(arr2[j]);
                }
                j++;
        }
        return res;
    }
}
