public class Pattern_14 {
    public static void main(String[] args){
        // pattern  14
        // A
        // A B
        // A B C
        int n = 3;
        display(n);
        // System.out.println(2^2);
    }
 
    private static void display(int n) {
        for (int i = 0; i < n; i++) {
            int num = 65;
            for(int j = 0 ; j< i+1; j++){
                System.out.print((char)num + " ");
                num = num + 1;
            } 
            System.out.println();
        }
    }
}
