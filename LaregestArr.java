import java.util.Scanner;
public class LaregestArr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>Largest){
                Largest=arr[i];
                
            }
        }
       System.out.println(Largest);
  }
}
