public class Gcd {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int ans = getGcd(a, b);
        System.out.println(ans);
    }

    private static int getGcd(int a, int b) {
        // System.out.print(a+b+" ");
        if(b == 0){
            return a;
        }
        return getGcd(b, a % b);
    }
}
