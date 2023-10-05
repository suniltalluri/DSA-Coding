public class SubSet {
    public static void main(String[] args) {
         subSets("abc","",0);
        // System.out.println(ans);
    }

    private static void subSets(String s, String curr, int i) {
        if(i == s.length()){
            System.out.println(curr);
            return ;
        }
        subSets(s, curr + s.charAt(i), i+1);
        subSets(s, curr, i+1);
        // return curr;
    }
}
