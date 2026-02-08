import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    static int[] twosum(int[] arr, int target){
        HashMap<Integer ,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int need=target-arr[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(arr[i],i);
        }
            return new int[]{};

    }
    public static void main(String[] args) {
        int arr[]={1,2,4};
        int target=5;
       int[] res=twosum(arr, target);
       System.out.println(Arrays.toString(res));
    }
}
