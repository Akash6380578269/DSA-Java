import java.util.HashSet;

public class LC128_LongestConsecutiveSequence {
    class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //int count=0;

        for (int x : nums) {
            set.add(x);
        }
        int MaxCount = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int crr = x;
                int count = 1;
                while (set.contains(crr + 1)) {
                    count++;
                    crr++;
                }

                MaxCount = Math.max(MaxCount, count);
            }
        }

        return MaxCount;
    }
}
}
