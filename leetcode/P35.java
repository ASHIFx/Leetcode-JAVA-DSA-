class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            if(nums[i]>=target){
                break;
            }
        }
        return i;
    }
}