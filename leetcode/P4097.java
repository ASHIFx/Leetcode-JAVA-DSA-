class Solution {
    public int minMergedInteger(int[] nums) {
        int current = 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length ; i=i+2){
            current = Integer.parseInt("" + nums[i] + nums[i + 1]);
            ans = Math.min(ans, current);
        }
        return ans;
    }
}