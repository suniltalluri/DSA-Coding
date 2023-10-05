public class Pattern_19 {
    public static void main(String[] args){
        // pattern  19
        // ******
        // **  **
        // *    *
        // *    *
        // **  **
        // ******
        int n = 6;
        display(n);
        // System.out.println(2^2);
    }
 
    private static void display(int n) {
        for (int i = 0; i < 2*n; i++) {
            int Lstar = i < n ? n-i : i-n+1;
            int Rstar = i < n ? n-i : i-n+1;
            int spaces = i < n ? (2*i) : (((2*n)-i)*2)-2;
            for(int j = 0 ; j< Lstar; j++){
                System.out.print("* ");
            } 
            for (int k = 0; k < spaces ; k++) {
                System.out.print("- "); 
            }
            for(int j =0 ; j<Rstar; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }

        // for (int i = 0; i < n; i++) {
        //     for(int j = 0 ; j <= i; j++){
        //         System.out.print(" *");
        //     } 
        //     // for (int k =0; k < (2*n)-(2*i)-2 ; k++) {
        //     for (int k =(2*n)-2*(i+1); k > 0 ; k--) {
        //         System.out.print("  "); 
        //     }
        //     for(int j =0 ; j <=i; j++){
        //         System.out.print(" *");
        //     } 
        //     System.out.println();
        // }
    }
}
