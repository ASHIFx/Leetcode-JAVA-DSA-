class Solution {
    public boolean checkPerfectNumber(int num) {
        // int sum = 0;
        // for(int i = 1; i < num; i++){
        //     if(num%i == 0) sum+=i;
        //     if(sum > num) return false;
        // }
        // return sum == num;

        //  OPTIMAL

        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
        // explanation:  contraints says [1,10^8] and these are only perfect number between this
    }
}