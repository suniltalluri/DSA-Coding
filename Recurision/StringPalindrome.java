public class StringPalindrome {
    public static void main(String[] args){
        String s = "mam";
        String ans = isPaindrome(s,"");
        System.out.println(ans.equals(s));
    }

    private static String isPaindrome(String s, String reverse) {
        char a = s.charAt(s.length()-1);
        if(s.length() == 1){
            return reverse + a;
        }
        return isPaindrome(s.substring(0,s.length()-1), reverse + a);
    }
}
