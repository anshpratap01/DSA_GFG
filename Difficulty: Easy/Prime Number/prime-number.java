class Solution {
    static boolean isPrime(int n) {
        int count = 0;

        if (n <= 1) return false;  // 0, 1, and negatives are not prime

        // count how many numbers divide n
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // prime numbers have exactly 2 divisors: 1 and itself
        if (count == 2)
            return true;
        else
            return false;
    }
}