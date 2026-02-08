public class LC2240_WaysToBuyPensPencils {
    class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ways = 0;
        for (int x = 0; x * cost1 <= total; x++) {
            int remaining = total - x * cost1;
            // int y = remaining / cost2;
            ways += (remaining / cost2) + 1;
        }
        return ways;
    }
}
}
