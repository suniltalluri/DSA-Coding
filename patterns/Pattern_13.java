public class Pattern_13 {
    public static void main(String[] args){
        // pattern  13
        //  1
        // 2 3
        // 4 5 6
        int n = 5;
        display(n);
    }
 
    private static void display(int n) {
        int num = 1; 
        for (int i = 0; i < n; i++) {
            for(int j = 1 ; j <= i+1; j++){
                System.out.print(num+ " ");
                num = num + 1;
            } 
            System.out.println();
        }
    }
}
