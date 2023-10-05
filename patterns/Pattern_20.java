public class Pattern_20 {
    public static void main(String[] args){
        // pattern  20
          
        // **  **
        // ******
        // **  **
        // *    *
        int n = 5;
        display(n);
        // System.out.println(2^2);
    }
 
    private static void display(int n) {
        for (int i = 0; i < (2*n)-1; i++) {
            int Lstar = i < n? i+1 : (2*n)-i-1;
            int Rstar = i < n? i+1 : (2*n)-i-1;
            int spaces = i < n ? 2*(n-i-1) : 2*(i-n+1);
            for(int j = 0 ; j<Lstar; j++){
                System.out.print("* ");
            } 
            for (int k = 0 ; k < spaces ; k++) {
                System.out.print("  "); 
            }
            for(int j = 0 ; j<Rstar; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}
