class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int temp = 0;
            while(num > 0){
                temp += num%10;
                num = num/10;
            }
            if(temp == i) return i;
        }
        return -1;
    }
}