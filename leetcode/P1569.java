import java.util.ArrayList;
import java.util.List;

class Solution {
    static final int MOD = 1_000_000_007;
    long[][] C;

    public int numOfWays(int[] nums) {
        int n = nums.length;
        C = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int x : nums) list.add(x);
        return (int) ((solve(list) - 1 + MOD) % MOD);
    }

    long solve(List<Integer> nums) {
        if (nums.size() <= 1) return 1;
        int root = nums.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < root) left.add(nums.get(i));
            else right.add(nums.get(i));
        }
        long leftWays = solve(left);
        long rightWays = solve(right);
        long ways = C[nums.size() - 1][left.size()];
        return (((ways * leftWays) % MOD) * rightWays) % MOD;
    }
}