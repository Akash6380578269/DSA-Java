public class removeDuplicate {
    static int removeDuplicates(int [] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
       return i+1;
      
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3};
      int  res=  removeDuplicates(arr);
        for(int i=0;i<res;i++){
            System.out.println(arr[i]);
        }

    }
}
