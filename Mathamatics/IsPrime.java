public class IsPrime {
    public static void main(String[] args) {
        int num = 11;
        Boolean ans = IsPrime(num);
        System.out.println(ans);
    }

    private static Boolean IsPrime(int num) {
        if(num == 1){
            return false;
        }
        if(num % 2 == 0 || num % 3 == 0){
            return false;
        }
        for(int i = 5; i*i <= num; i = i + 6){
            if(num % i == 0 || num % (i + 2)== 0){
                return false;
            }
        }
        return true;
    }

    // private static Boolean IsPrime(int num) {
    //     if(num == 1){
    //         return false;
    //     }
    //     for(int i = 2; i*i <= num; i++ ){
    //         if(num % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
