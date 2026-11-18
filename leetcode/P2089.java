class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> answer = new ArrayList<>();

        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     if(nums[i] == target) answer.add(i);
        // }
        // return answer;

        // OPTIMAL

        int lessThnCount = 0, targetCount = 0;
        for(int i : nums){
            if(target == i) targetCount++;
            else if(target > i) lessThnCount++;
        }
        for(int j = 0; j < targetCount; j++) answer.add(lessThnCount + j);
        return answer;
    }
}