public class FindLeader {
    public static void main(String[] args) {
        int[] arr = {7,10,4,10,6,5,1,2};
        System.out.print(arr[arr.length-1]+" ");
        findLeader1(arr,arr.length-2,arr[arr.length-1]);
    }

    //efficient  code.....
    private static void findLeader1(int[] arr, int i, int leader) {
        if(i < 0){
            return;
        }
       if(arr[i] > leader){
            leader = arr[i];
            System.out.print(leader+" ");
       }
        
        findLeader1(arr, i-1,leader);

    }
    //Brute force solution.....
    private static void findLeader2(int[] arr, int i) {
        if(i > arr.length-1){
            return;
        }
        boolean temp = false;
        for(int j = i+1; j<arr.length-1; j++){
            if(arr[j] >= arr[i]){
                temp = true;
                break;
            }
        }
        if(temp == false){
            System.out.println(arr[i]);
        }
        findLeader2(arr, i+1);

    }
}
