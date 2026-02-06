import java.util.HashMap;

public class countMorethanOne {
    public static void main(String[] args) {
        int[] arr={1,3,1,2,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int sum=0;
        for(int Key:map.keySet()){
            if(map.get(Key)==1){
                sum+=Key;
              
            }
             
        }
         System.out.println(sum);
    }
}
