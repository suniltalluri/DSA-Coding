public class Pattern_6 {
    public static void main(String[] args){
        // pattern 6
        //123
        //12
        //1
        int n = 5;
        display(n);
    }

    private static void display(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i+1;j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }
}
