class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] sorted = new int[m+n];
        int idx1 = 0, idx2 = 0;
        int i = 0;
        while(idx1 < m && idx2 < n) {
            if (nums1[idx1] > nums2[idx2]) {
                sorted[i++] = nums2[idx2++];
            } else {
                sorted[i++] = nums1[idx1++];
            }
        }
        while (idx1 < m) {
            sorted[i++] = nums1[idx1++];
        }
        while (idx2 < n) {
            sorted[i++] = nums2[idx2++];
        }
        
        int total = m + n;
        if (total % 2 == 1) {
            return sorted[total/2];
        } else {
            return (sorted[total/2 - 1] + sorted[total/2]) / 2.0;
        }
    }
}