public class IntPalindrome {
    public static void main(String[] args){
        int n = 1211 ;
        int ans = isPalindrome(n, 0);
        System.out.println(ans == n);
    }

    private static int isPalindrome(int n, int rev) {
        int num = n % 10;
        if(n == 0){
            return rev;
        }
        return isPalindrome(n/10, (rev * 10) + num); 
    }
}
