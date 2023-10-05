public class Pattern_11 {
    public static void main(String[] args){
        // pattern  11
        //  1
        //  01
        //  101
        //  0101
        //  10101
        //   *
        int n = 5;
        display(n);
       
    }
 
    private static void display(int n) {
        int s = 1;
        for (int i = 0; i < n; i++) {            
            for(int j = i+1 ; j> 0; j--){ 
                 s = j % 2 == 0 ? 0 : 1;
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
