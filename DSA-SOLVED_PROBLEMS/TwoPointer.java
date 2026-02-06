import java.util.Arrays;

public class TwoPointer {
    static void MoveZeroToend(int[] arr){
      int j=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            int  temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
         

 }
 for(int x: arr){
 System.out.println(x);

 }
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,12};
        MoveZeroToend(arr);
       

    }
}
