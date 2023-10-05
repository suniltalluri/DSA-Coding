public class Pattern_4 {
    public static void main(String[] args){
        // pattern 2 
        // 1
        // 22
        // 333
        // 4444
        int n = 5;
        display(n);
    }

    private static void display(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 0; j<i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
