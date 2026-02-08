public class LC1869_LongerOnesThanZeros {
    class Solution {
    public boolean checkZeroOnes(String s) {
        int oneCount = 0;
        int MaxOneCount = 0;
        int crrZero=0;
        int MaxcrrZero=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            } else {
                oneCount=0;
            }
            MaxOneCount=Math.max(MaxOneCount,oneCount);
            if(s.charAt(i)=='0'){
                crrZero++;
            }
            else{
                crrZero=0;
            }
            MaxcrrZero=Math.max(MaxcrrZero,crrZero);
            
        }

        return MaxOneCount > MaxcrrZero;
    }
}
}
