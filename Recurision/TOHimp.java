class TOHimp{
    public static void main(String[] args) {
        // TOH(3,'A','B','C');
        //  boolean ans  = reverse(262  ); 
        //  System.out.println(2 % 14);
        String ans = getPalindromic("sas","");

         System.out.println(ans.equals("sam"));
         System.out.println(ans);
         System.out.println("sas");

    }

    private static boolean reverse(int i) {
        String s = "";
        int j = i; 
        while(i > 0 ){
            int num = i % 10;
            s = s + num ;
            i = i / 10;
        }

        if(j == Integer.parseInt(s)){
            return true;
        }else{
            return false;
        }
    }

    // To check how the recursion is printing....
    private static void print(int i) {
        if(i == 0){
            System.out.println(i);
            return ;
        }
        print(i-1);
        // System.out.println(i);
    }

    private static void TOH(int i, char a, char b, char c) {
        if(i == 1){
            System.out.println("move " + i + " from " + a + " to " + c);
            return;
        }
        TOH(i-1, a, c, b);
        System.out.println("move " + i+ " from " + a + " to " + c);
        TOH(i-1, b, a, c);
    }

    public static String getPalindromic(String w, String s){
        while(w.length() == 0){
            return s;
        }
         char a = w.charAt(w.length()-1);
         return getPalindromic(w.substring(0,w.length()-1),s+a);
     }
}