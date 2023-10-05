public class MissingNum {
    public static void main(String[] args) {
        int n = 4;
        int[] arr= {1,2,4,5};
        getMissing(arr, n);
    }

    private static void getMissing(int[] arr, int n) {
        int xor1 =0;
        int xor2 = 0;
        // for(int i = 1; i<=n; i++){
            //     xor1 = xor1^i;
            // }
            for(int j = 0;j<n;j++){
                xor2= xor2 ^ arr[j]; 
                xor1 = xor1^(j+1);
        }
        // int n = n-1;
        System.out.println(xor1^xor2^(n+1));
    }
}
