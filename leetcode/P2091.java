class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int max = 0, min = 0;
        for(int i = 1; i < n; i++){
            if(nums[max] < nums[i]) max = i;
            if(nums[min] > nums[i]) min = i;
        }
        int left = Math.min(min, max);
        int right = Math.max(min, max);

        int opt1 = right + 1;
        int opt2 = n - left;

        int opt3 = (left + 1) + (n - right);

        return Math.min(opt1, Math.min(opt2, opt3));
    }
}