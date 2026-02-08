public class LC2414_LongestAlphabeticalSubstring {
    class Solution {
    public int longestContinuousSubstring(String s) {
        int Maxlen = 1;
        int crrlen = 1;
        for (int i = 1; i < s.length(); i++) {
            // int crrLen=0;
            // char ch=s.charAt[i];
            if (s.charAt(i) - s.charAt(i - 1) == 1) {
                crrlen++;
            } else {
                crrlen = 1;
            }
            Maxlen = Math.max(Maxlen, crrlen);
        }
        return Maxlen;
    }
}
}
