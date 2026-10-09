class Solution {
    public int firstMissingPositive(int[] nums) {
        // int ans = 1;
        // if(nums.length == 1 && nums[0] != 1) return 1;
        // Set<Integer> seen = new HashSet<>();
        // for(int a: nums) seen.add(a);
        // for(int i = 1; i < nums.length; i++){
        //     if(!seen.contains(i)){
        //         ans = i;
        //         return ans;
        //     }
        // }
        // if(!seen.contains(0)){
        //     return Collections.max(seen)+1;
        // }
        // return ans;

        Set<Integer> seen = new HashSet<>();
        for(int a: nums) seen.add(a); 
        for (int i = 1; i <= nums.length + 1; i++) {
            if(!seen.contains(i)) return i;
        }
        return 1;
    }
}