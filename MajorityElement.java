public class MajorityElement {
    static int MajorityElements(int [] arr){
        int count=0;
        int Element=0;
           for(int x:arr){
            if(count==0){
                Element=x;
            }
            if(Element==x){
                count++;
            }
            else{
                count--;
            }

           }
           return Element;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,2,2};
        int res=MajorityElements(arr);
        System.out.println(res);
    }
}
