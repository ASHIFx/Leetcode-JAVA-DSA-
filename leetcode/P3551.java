import java.util.Arrays;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] digitSum = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            int sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            digitSum[i] = sum;
        }

        Integer[] order = new Integer[n];

        for (int i = 0; i < n; i++) {
            order[i] = i;
        }

        Arrays.sort(order, (a, b) -> {
            if (digitSum[a] != digitSum[b]) {
                return Integer.compare(digitSum[a], digitSum[b]);
            }
            return Integer.compare(nums[a], nums[b]);
        });

        int swaps = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] || order[i] == i) {
                continue;
            }

            int cycle = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = order[j];
                cycle++;
            }

            swaps += cycle - 1;
        }

        return swaps;
    }
}