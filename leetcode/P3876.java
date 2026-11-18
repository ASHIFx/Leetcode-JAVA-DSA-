class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddCount = 0, evenCount = 0;
        int minOdd = Integer.MAX_VALUE, minEven = Integer.MAX_VALUE;

        for(int num: nums1) {
            if (num%2 == 0){
                evenCount++;
                minEven = Math.min(minEven, num);
            } else {
                oddCount++;
                minOdd = Math.min(minOdd, num);
            }
        }
        boolean canAllEven = (oddCount == 0);
        boolean canAllOdd = (evenCount == 0) || (oddCount > 0 && minOdd < minEven);

        return canAllEven || canAllOdd;
    }
}