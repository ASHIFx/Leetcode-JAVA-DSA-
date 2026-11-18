class Solution {
    static final long MOD = 1_000_000_007L;

    long[] sum;
    long[] sumSq;
    long[] lazy;

    public int sumCounts(int[] nums) {
        int n = nums.length;

        sum = new long[4 * n];
        sumSq = new long[4 * n];
        lazy = new long[4 * n];

        HashMap<Integer, Integer> last = new HashMap<>();

        long ans = 0;

        for (int r = 0; r < n; r++) {
            int prev = last.getOrDefault(nums[r], -1);

            update(1, 0, n - 1, prev + 1, r, 1);

            ans = (ans + sumSq[1]) % MOD;

            last.put(nums[r], r);
        }

        return (int) ans;
    }

    private void update(int node, int start, int end,
                        int ql, int qr, long val) {

        if (ql > end || qr < start) {
            return;
        }

        if (ql <= start && end <= qr) {
            apply(node, start, end, val);
            return;
        }

        push(node, start, end);

        int mid = start + (end - start) / 2;

        update(node * 2, start, mid, ql, qr, val);
        update(node * 2 + 1, mid + 1, end, ql, qr, val);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        sumSq[node] = (sumSq[node * 2] + sumSq[node * 2 + 1]) % MOD;
    }

    private void apply(int node, int start, int end, long val) {
        long len = end - start + 1;

        sumSq[node] = (
            sumSq[node]
            + 2L * val % MOD * sum[node] % MOD
            + len % MOD * val % MOD * val % MOD
        ) % MOD;

        sum[node] = (
            sum[node] + len % MOD * val % MOD
        ) % MOD;

        lazy[node] = (lazy[node] + val) % MOD;
    }

    private void push(int node, int start, int end) {
        if (lazy[node] == 0 || start == end) {
            return;
        }

        int mid = start + (end - start) / 2;

        apply(node * 2, start, mid, lazy[node]);
        apply(node * 2 + 1, mid + 1, end, lazy[node]);

        lazy[node] = 0;
    }
}