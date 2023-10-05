public class CountConsecutives {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        int ans = getCount(arr,0,0,0);
        System.out.println(ans); 
    }

    private static int getCount(int[] arr,int count, int max,int i) {
        if(i>arr.length-1){
            return max;
        }
        if(arr[i] == 1){
            count++;
        }else{
            count = 0;
        }
        max = Math.max(max, count);
        return getCount(arr, count, max, i+1);
    }

}
 