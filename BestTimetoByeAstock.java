public class BestTimetoByeAstock {
    static int Maxprofit(int [] arr){
      int Maxprofit=0;
      int min=arr[0];

      for(int i=0;i<arr.length;i++){
          if(arr[i]<min){
            min=arr[i];
          }
          int profit=arr[i]-min;
          Maxprofit=Math.max(Maxprofit, profit);
      }

    return Maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int res=Maxprofit(arr);
        System.out.println(res);
    }
    

}
