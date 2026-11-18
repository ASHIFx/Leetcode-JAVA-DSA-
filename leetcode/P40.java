import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> current, int start){
        int total = 0;
        for(int i : current) total += i;
        if(total == target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(total > target) return;
        for(int j = start; j < candidates.length; j++){
            if(j > start && candidates[j] == candidates[j - 1]) continue;
            current.add(candidates[j]);
            backtrack(candidates, target, result, current, j+1);
            current.remove(current.size() - 1);
        }
    }
}