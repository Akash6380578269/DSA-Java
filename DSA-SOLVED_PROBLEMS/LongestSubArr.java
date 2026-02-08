import java.util.HashMap;

public class LongestSubArr {
        static int LongestSubArray(int [] arr,int k){
            HashMap<Integer,Integer> map=new HashMap<>();
            int maxLen=0;
            int prifixSum=0;
            for(int i=0;i<arr.length;i++){
                 prifixSum+=arr[i];
                 if(prifixSum==k){
                    maxLen=i+1;
                 }
                 if(map.containsKey(prifixSum-k)){
                    maxLen=Math.max(maxLen,i-map.get(prifixSum-k));

                 }
                 if(!map.containsKey(prifixSum)){
                    map.put(prifixSum,i);

                 }
            }
            return maxLen;

        }
        public static void main(String[] args) {
            int arr[]={10,5,2,7,1,9};
            int k=15;
            int res=LongestSubArray(arr, k);
            System.out.println(res);
        }
}
