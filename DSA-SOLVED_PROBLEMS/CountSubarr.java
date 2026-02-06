import java.util.HashMap;

public class CountSubarr {
    static int countSubarray(int[] arr,int k){
        int prifixSum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            prifixSum+=arr[i];
            if(map.containsKey(prifixSum-k)){
                count+=map.get(prifixSum-k);
            }
            map.put(prifixSum,map.getOrDefault(prifixSum,0 )+1);
        }
        return count;
    }


    public static void main(String[] args) {
        int [] arr={1,2,2,2};
        int k=4;
        int res=countSubarray(arr, k);
        System.out.println(res);
    }
    
}
