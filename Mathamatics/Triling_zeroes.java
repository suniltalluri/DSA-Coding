class Triling_zeroes{
    public static void main(String[] args) {
        int n = 100;
        int ans = get_Triling_zeroes(n,0);
        System.out.println(ans );
    }

    private static int get_Triling_zeroes(int n, int res) {
        if(n == 1){
            return n;
        }
        for (int i = 5; i <= n; i *= 5) {
            res = res + n/i;
        }
        return res;
    }
}