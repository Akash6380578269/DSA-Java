public class kdaneAlgorithm {
    static int MaxSuminSubarr(int[] arr){
          int Maxsum=arr[0];
          int currentSum=0;
          for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
             if(currentSum>Maxsum){
             Maxsum=currentSum;
             }
             if(currentSum<0){
                currentSum=0;
             }
       }
    
    return Maxsum;
}
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int res=MaxSuminSubarr(arr);
        System.out.println(res);
    }
}
