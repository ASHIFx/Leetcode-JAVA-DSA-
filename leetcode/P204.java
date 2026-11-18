class Solution {
    public int countPrimes(int n) {
    //     int count = 0;

    //     for (int i = 2; i < n; i++) {

    //         if (prime(i))
    //             count++;
    //     }

    //     return count;
    // }

    // private boolean prime(int num) {
    //     if(num % 2 == 0 && num != 2)
    //         return false;
    //     if (num < 2)
    //         return false;

    //     for (int i = 2; i * i <= num; i++) {
    //         if (num % i == 0) {
    //             return false;
    //         }
    //     }

    //     return true;

    // optimal

        if (n < 3) return 0;
        
        boolean[] notPrime = new boolean[n];
        int count = 0;
        
        for(int i = 2; i < n; i++) {
            if(!notPrime[i]) {
                count++;
                for(long j = (long) i * i; j < n; j += i) {
                    notPrime[(int) j] = true;
                }
            }
        }
        
        return count;
    }
}