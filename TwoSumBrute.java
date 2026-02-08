public class TwoSumBrute {
    public static void main(String[] args) {
            int[] arr={2,3,4,5,6};
            int target=15;
            int n=arr.length;
            boolean check=false;
            for(int i=0;i<n-1;i++){
               for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    check=true;
                }
                
               }
            }
             if(check==false){
                System.out.println("n");
            }
    }
}