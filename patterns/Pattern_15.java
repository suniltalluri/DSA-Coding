public class Pattern_15 {
    public static void main(String[] args){
        // pattern  15
        // A B C
        // A B
        // A
        int n = 5;
        display(n);
        // System.out.println(2^2);
    }
 
    private static void display(int n) {
        for (int i = 0; i < n; i++) {
            int num = 65;
            for(int j = n ; j > i; j--){
                System.out.print((char)num+" ");
                num = num + 1;
            } 
            System.out.println();
        }
    }
}
