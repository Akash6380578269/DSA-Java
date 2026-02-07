public class AddDigits {
    class Solution {
    public int addDigits(int n) {
        return n == 0 ? 0 : (n - 1) % 9 + 1;
    }
}
}
