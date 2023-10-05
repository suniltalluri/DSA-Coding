public class PowerOfN {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int ans  = power(a,b);
        System.out.println(ans);
    }

    private static int power(int a, int b) {
        if(b == 0){
            return 1;
        }
        int temp = power(a, b/2);
        temp = temp * temp;
        if(b % 2 == 0){
            return temp;
        }else{
            return temp * a;
        }
    }
}
