class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (int num : nums) {
        //     if (map.get(num) > nums.length / 2) {
        //         return num;
        //     }
        // }

        // return -1;

        // OPTIMAL
        //using moor's voting algorithm
        int count = 0, ele = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count++;
                ele = nums[i];

            } else if (ele == nums[i]) {
                count++;

            } else {
                count--;
            }
        }
        return ele;

    }
}