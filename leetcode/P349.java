class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int i = 0; i < nums1.length; i++){
        //         for(int j = 0; j < nums2.length; j++){
        //             if(nums1[i] == nums2[j] && !set.contains(nums1[i])){
        //                 set.add(nums1[i]);
        //             }
        //         }
        //     }
        //     int[] result = new int[set.size()];
        //     int idx = 0;
        //     for(int k : set){
        //         result[idx] = k;
        //         idx++;
        //     }
        //     return result;
        // }

        //  OPTIMAL

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;

        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;

    }
}