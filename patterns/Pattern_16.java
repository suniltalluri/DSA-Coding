public class Pattern_16 {
    public static void main(String[] args){
        // pattern  16
        // A
        // B B
        // C C C
        int n = 5;
        display(n);
        // System.out.println(2^2);
    }
 
    private static void display(int n) {
        int num = 65;
        for (int i = 0; i < n; i++) {
            for(int j = 0 ; j < i+1; j++){
                System.out.print((char)num+" ");
            } 
            num = num + 1;
            System.out.println();
        }
    }
}
