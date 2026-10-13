class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        long operations = (long) k1 + k2;
        int n = nums1.length;

        long[] diff = new long[n];

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs((long) nums1[i] - nums2[i]);
        }

        Arrays.sort(diff);

        int i = n - 1;

        while (i >= 0 && operations > 0) {
            int j = i;

            while (j > 0 && diff[j - 1] == diff[i]) {
                j--;
            }

            long next = (j > 0) ? diff[j - 1] : 0;
            long gap = diff[i] - next;
            long count = i - j + 1;

            if (operations >= gap * count) {
                operations -= gap * count;

                for (int x = j; x <= i; x++) {
                    diff[x] = next;
                }

                i = j - 1;
            } else {
                long decrease = operations / count;
                long remainder = operations % count;

                for (int x = j; x <= i; x++) {
                    diff[x] -= decrease;
                    if (remainder > 0) {
                        diff[x]--;
                        remainder--;
                    }
                }

                operations = 0;
            }
        }

        long ans = 0;

        for (long d : diff) {
            ans += d * d;
        }

        return ans;
    }
}