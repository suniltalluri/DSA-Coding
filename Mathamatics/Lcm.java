public class Lcm {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int ans = getLcm(a, b);
        int ans1 = getGcd(a, b);
        System.out.println(ans);
        System.out.println(ans1);
    }
    private static int getGcd(int a, int b){
        if(b == 0){
            return a;
        }
        return getGcd(b, a % b);
    }

    private static int getLcm(int a, int b) {

        return (a * b)/getGcd(a, b);
    }
}
