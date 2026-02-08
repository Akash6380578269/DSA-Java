import java.util.Scanner;
public class CheckifArrISsorted { 
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    boolean check=false;
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            check=true;
            break;
        }
    }
    if(check){
        System.out.println("Not Sorted");
    }
    else{
        System.out.println("Sorted");
    }
}
}