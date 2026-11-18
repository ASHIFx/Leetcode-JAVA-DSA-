class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> current, int start) {
        int totalsum = 0;
        for (int i : current) {
            totalsum += i;
        }
        if (totalsum == target) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (totalsum > target) {
            return;
        }
        for (int j = start; j < candidates.length; j++) {
            current.add(candidates[j]);
            backtrack(candidates, target, result, current, j);
            current.remove(current.size() - 1);
        }
    }
}