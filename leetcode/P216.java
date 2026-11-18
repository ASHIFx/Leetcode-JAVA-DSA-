import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, result, new ArrayList<>(), 1);
        return result;
    }

    private void backtrack(int k, int n, List<List<Integer>> result, List<Integer> current, int start) {
        int total = 0;
        for (int i : current)
            total += i;
        if (current.size() == k) {
            if (total == n) {
                result.add(new ArrayList<>(current));
            }
            return;
        }
        for (int i = start; i < 10; i++) {
            current.add(i);
            backtrack(k, n, result, current, i + 1);
            current.remove(current.size() - 1);
        }
    }
}