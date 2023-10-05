public class Pattern_12 {
    public static void main(String[] args){
        // pattern  12
        // 1                 1 
        // 1 2             2 1
        // 1 2 3         3 2 1
        // 1 2 3 4     4 3 2 1
        // 1 2 3 4 5 5 4 3 2 1
        int n = 5;
        display(n);
        // System.out.println(2^2);
    }
 
    private static void display(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 1 ; j<= i+1; j++){
                System.out.print(j+" ");
            } 
            for (int k = 2*n-i-2; k > i ; k--) {
                System.out.print("  "); 
            }
            for(int j = i+1 ; j>0; j--){
                System.out.print(j+" ");
            } 
            System.out.println();
        }
    }
}
