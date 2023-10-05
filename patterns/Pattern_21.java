public class Pattern_21 {
    public static void main(String[] args){
        // pattern  7
        // ***
        // * *
        // ***
        int n = 6;
        // for(int j = 0 ; j<n; j++){
        //     System.out.print("* ");
        // } 
        // System.out.println();
        // System.out.println();
        display(n);
        // for(int j = 0 ; j<n; j++){
        //     System.out.print("* ");
        // } 
        // System.out.println(2^2);
    }
    
    private static void display(int n) { 
        for (int i = 0; i < n; i++) {
            int Lstars = (i == 0) || (i == n-1)? n : 1;
            int spaces = i > 0 || i < n-1 ? n-2:0;
           
            if(i >0 && i < n-1){
                for(int j = 0 ; j<Lstars; j++){
                System.out.print("* ");
                } 
                for (int k = 0; k < spaces ; k++) {
                    System.out.print("  "); 
                }
                for(int j = 0 ; j<Lstars; j++){
                    System.out.print("* ");
                } 
            }else{
                for(int j = 0 ; j<Lstars; j++){
                    System.out.print("* ");
                } 
            }
            
            System.out.println();
            System.out.println();
            // System.out.println();
        
        }
    }
}
