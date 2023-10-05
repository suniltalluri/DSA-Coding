public class Pattern_8 {
    public static void main(String[] args){
        // pattern  8
        // *****
        //  ***
        //   *
        int n = 5;
        display(n);
        // System.out.println(2^2);
    }
 
    private static void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k<i; k++) {
                System.out.print("  "); 
            }
            for(int j = (2*n)-i-1; j > i; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
