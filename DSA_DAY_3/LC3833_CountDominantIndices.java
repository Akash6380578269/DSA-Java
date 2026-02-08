public class LC3833_CountDominantIndices {
    class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int total_sum = 0;
        for (int x : nums) {
            total_sum += x;
        }
        int count = 0;
        int prifix_sum = 0;
        for (int i = 0; i < n - 1; i++) {
            int right_sum = total_sum - prifix_sum - nums[i];
            int right_count = n - i - 1;
            double avg = (double) right_sum / right_count;
            prifix_sum += nums[i];
            if (nums[i] > avg) {
                count++;
            }
        }
        return count;
    }
}
}
