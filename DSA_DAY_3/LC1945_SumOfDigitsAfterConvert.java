public class LC1945_SumOfDigitsAfterConvert {
    class Solution {
    public int getLucky(String s, int k) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = ch - 'a' + 1;
            while (val > 0) {
                num += val % 10;
                val /= 10;
            }
        }
        while (k > 1) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
            k--;
        }
        return num;
    }
}
}
