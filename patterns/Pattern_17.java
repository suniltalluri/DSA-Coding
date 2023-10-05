public class Pattern_17 {
    public static void main(String[] args){
        // pattern  17
    //     A  
    //     ABA 
    //    ABCBA
       
        int n = 3;
        display(n);
        // System.out.println(2^2);
    }
  
    private static void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                System.out.print("  ");
                
            }
            int num = 65;
            for(int j = 0 ; j < (i)+1; j++){
                int innerLoop = j < i+1 ? num :null;

                // System.out.print(j < i+1 ? (char)num + " " :""+ (char)(num-2)+" ");
                System.out.print((char)innerLoop+" ");
                num = num + 1;
                // num1 = num1 +  1;
            } 
            for (int k =65+i-1 ; k >= 65 ; k--) {
                System.out.print((char)k + " ");
            }
            System.out.println();
        }
    }
}
