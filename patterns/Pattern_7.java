public class Pattern_7 {
    public static void main(String[] args){
        // pattern  7
        //   *
        //  ***
        // *****
        int n = 5;
        display(n);
        // System.out.println(2^2);
    }
 
    private static void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = n-1; k > i ; k--) {
                System.out.print("  "); 
            }
            for(int j = 0 ; j< (2*i)+ 1; j++){
                System.out.print(" *");
            } 
            System.out.println();
        }
    }
}
