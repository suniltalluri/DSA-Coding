public class Pattern_2 {
    public static void main(String[] args){
        // pattern 2 
        // *
        // **
        // ***
        // ****
        int n = 5;
        display(n);
    }

    private static void display(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
