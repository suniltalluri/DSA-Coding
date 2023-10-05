public class pattern_10 {
    public static void main(String[] args){
        // pattern  10
        // *
        // ***
        // *****
        // *****
        // ***
        // *
        int n = 5;
        display(n);
       
    }
 
    private static void display(int n) {
        for (int i = 0; i < 2*n-1; i++) {
            // int spaces = i < n ? n-i-1 : i-n;
            // for (int k = 0; k < spaces ; k++) {
            //     System.out.print("  "); 
            // }
            
            int innerloop = i < ((2*n)/2) ? i+1:(2*n)-i-1;
            for(int j = 0 ; j< innerloop; j++){
                System.out.print("* ");
                // System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
