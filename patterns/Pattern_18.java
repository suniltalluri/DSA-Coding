public class Pattern_18 {
    public static void main(String[] args){
        // pattern  18
        // C
        // B C
        // A B C
        int n = 6;
        display(n);
    }
 
    private static void display(int n) {
        for (int i = 0; i < n; i++) {
            int num = 65 + n-i-1;
            for(int j = 0; j <= i; j++){
                System.out.print((char)num+" ");
                num = num+1;
            } 
            System.out.println(); 
        }
    }
}
