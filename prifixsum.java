public class prifixsum {
    public static void main(String[] args) {
        int []arr={2,5,8,10,20};
        int n=arr.length;
         int [] prifix=new int[n];
        prifix[0]=arr[0];
        for(int i=1;i<prifix.length;i++){
            prifix[i]=prifix[i-1]+arr[i];
            
        }
        for(int x:prifix){
            System.out.println(x);
        }
 
    }
}
