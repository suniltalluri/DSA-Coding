import java.util.ArrayList;
import java.util.List;

class Joshphus{
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        k--;
        int i = 0;

        List<Integer> list = new ArrayList<>();
    
        for (int j = 1; j <=n; j++) {
            list.add(j);
        }
        getInt(list, k, i);
    }
    private static void getInt(List<Integer> list, int k, int i){


        if(list.size() == 1){
            System.out.println(list.get(0));
            return;
            // return list.get(0);
        }
        i = (i + k) % list.size();
        list.remove(i);

        getInt(list ,k, i);

        // return -1;
    }
}