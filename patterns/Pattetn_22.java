public class Pattetn_22 {
    public static void main(String[] args){
        // pattern  22
        // 3 3 3 3 3 
        // 3 2 2 2 3 
        // 3 2 1 2 3 
        // 3 2 2 2 3 
        // 3 3 3 3 3
        int n = 4 ;      
        display(n);
        // System.out.println(2^2);
    }
 
    private static void display(int n) {
        for (int i = 0; i < (2*n)-1; i++) {
            for(int j = 0 ; j< (2*n)-1; j++){
                int t = j;
                int b = (2*n)-2-j;
                int l = i;
                int r = (2*n)-2-i;
                System.out.print(n-Math.min(Math.min(t,b),Math.min(l,r))+" ");
            } 
            System.out.println();
        }
    }
}
