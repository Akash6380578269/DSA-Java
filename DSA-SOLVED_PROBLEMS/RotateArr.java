// import java.util.*;
// public class RotateArr {
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         int [] arr =new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=scan.nextInt();
//            }
//            System.out.println("No of rotation");
//            int k=scan.nextInt();
//            k=k%n;
//         for(int r=0;r<k;r++) {
//             int temp=arr[0];
//            for(int i=0;i<n-1;i++){
//                   arr[i]=arr[i+1];
//            }
//            arr[n-1]=temp;
//         }  
//         for(int x:arr){
//             System.out.print(x);
//         }
//     }
    
// }
import java.util.*;
public class RotateArr {
    static void reverse(int[] arr, int start, int end) {
    while(start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
        public static void main(String[] args) {
            
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            System.out.println("Eneter no of rotation");
            int k=scan.nextInt();
            k=k%n;
            
    reverse(arr, 0, k-1);
    reverse(arr, k, n-1);
    reverse(arr, 0, n-1);
    for(int x:arr)
    System.out.print(x);
        }
}
