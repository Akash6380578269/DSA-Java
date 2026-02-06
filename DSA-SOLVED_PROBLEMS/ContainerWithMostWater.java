// public class ContainerWithMostWater {
//     static int MAxWater(int []arr){
//         int maxLen=0;
//         int left=0;
//         int right=arr.length-1;
//         while(left< right){
//             int width=right-left;
//             int minheight=Math.min(arr[left],arr[right]);
//             int area=width*minheight;
//             maxLen=Math.max(maxLen,area);
//             if(arr[left]<arr[right]){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }
//         return maxLen;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,8,6,2,5,4,8,3,7};
//         int res=MAxWater(arr);
//         System.out.println(res);
//     }
// }
