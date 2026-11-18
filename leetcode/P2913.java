class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            HashSet<Integer> set = new HashSet<>();
            int dist = 0;
            for (int j = i; j < nums.size(); j++) {
                if(!set.contains(nums.get(j))){
                    set.add(nums.get(j));
                    dist++;
                }
                ans += dist*dist;
            }
        }
        return ans;
    }
}