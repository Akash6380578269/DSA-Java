public class SubArrayWithGivenSum {
    static void  SubArrayWithGiveSum(int arr[],int target){
           int start=0;
           int sum=0;
           for(int end=0;end<arr.length;end++){
            sum+=arr[end];
            while (sum>target && start<=end) {
                sum-=arr[start];
                start++;
            }
            if(sum==target){
                System.out.println(start+" "+end);
                return;
            }
           }
           System.out.println("no sub arr found");
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,20,10,5};
        int k=33;
        SubArrayWithGiveSum(arr,k);
        
    }
    
}
