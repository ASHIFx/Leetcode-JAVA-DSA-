class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> elem = new HashSet<Integer>();
        int n = nums.length;
        int ans = 0;
        for(int i: nums){
            elem.add(i);
        }
        for(int j = 0; j <= n; j++){
            ans = j;
            if(!elem.contains(ans)){
                return ans;
            }
        }
        return ans;
    }
}