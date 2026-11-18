class Solution {
    public int findDuplicate(int[] nums) {
        // int ans = 0;
        // int n = nums.length;
        // Arrays.sort(nums);
        // for (int i = 0; i < n; i++) {     
        //     if (nums[i] == nums[i+1]) {
        //         ans = nums[i];
        //         return ans;
        //     }

        // }
        // return ans;

        // optimal

        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!seen.add(nums[i])) return nums[i];
        }
        return -1;
    }
}