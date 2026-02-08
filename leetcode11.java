public class leetcode11 {
static int MaxWater(int [] arr){
int Maxwater=0;
int left=0;
int right=arr.length-1;
while(left<right){
int width=right-left;
int minheight=Math.min(arr[right], arr[left]);
int area=width*minheight;
Maxwater =Math.max(Maxwater, area);
if(arr[left]<arr[right]){
    left++;
}
else{
    right--;
}

}
return Maxwater;

}
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int res=MaxWater(arr);
        System.out.println(res);
    }
}