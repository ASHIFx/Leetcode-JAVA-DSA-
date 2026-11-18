class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = new int[2];
        int i = 0;
        int j = n - 1;
        while(i < n){
            while(j > 0){
                if(numbers[i] + numbers[j] > target) j--;
                if(numbers[i] + numbers[j] < target) i++;
                if(numbers[i] + numbers[j] == target){
                    res[0] = i + 1;
                    res[1] = j + 1;
                    return res;
                }
                
            }
        }
        return new int[]{0,0};
    }
}