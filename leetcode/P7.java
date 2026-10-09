class Solution {
    public int reverse(int x) {
        int org = x;
        long result = 0;
        while (org != 0) {
            int r = org % 10;
            result = result * 10 + r;
            org = org / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}