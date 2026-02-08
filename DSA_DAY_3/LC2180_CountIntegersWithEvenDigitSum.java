public class LC2180_CountIntegersWithEvenDigitSum {
    class Solution {
    public int countEven(int num) {
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            int val = i + 1;
            while (val > 0) {
                nums[i] += val % 10;
                val /= 10;
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
}
