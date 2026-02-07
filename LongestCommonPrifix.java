public class LongestCommonPrifix {
    class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prifix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            int j = 0;
            while (j < prifix.length() && j < strs[i].length() &&
             prifix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            prifix = prifix.substring(0, j);

            if (prifix.isEmpty()) {
                return "";
            }

        }
        return prifix;
    }
}
}
