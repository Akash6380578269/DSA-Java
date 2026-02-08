public class ValidPalindrome {
    static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(left)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                right--;
                continue;
            }
            if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        boolean res=isPalindrome(s);
        System.out.println(res);
    }
}
