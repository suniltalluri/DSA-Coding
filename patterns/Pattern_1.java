class Pattern_1{
    public static void main(String[] args){
        // pattern....
        // *****
        // *****
        // *****
        // *****
        int n = 5;
         display(n);
        // System.out.println(s);
    }

    private static void display(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

  
}