public class Pattern_3 {
    public static void main(String[] args){
        // pattern 3 
        // 1
        // 12
        // 123
        // 1234
        int n = 5;
        display(n);
    }

    private static void display(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 1; j<=i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
