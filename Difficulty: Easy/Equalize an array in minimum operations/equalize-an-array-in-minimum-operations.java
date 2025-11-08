import java.util.*;

class Solution {
    static int MOD = 1000000007;

    static int equalizeArray(int N, int k, int A[]) {
        Arrays.sort(A);

        int rem = A[0] % k;

        // Step 1: Check if equalization is possible
        for (int i = 1; i < N; i++) {
            if (A[i] % k != rem) return -1;
        }

        // Step 2: Normalize array
        long[] B = new long[N];
        for (int i = 0; i < N; i++) {
            B[i] = (A[i] - rem) / k;
        }

        // Step 3: Find median
        Arrays.sort(B);
        long median = B[N / 2];

        // Step 4: Calculate total moves
        long moves = 0;
        for (int i = 0; i < N; i++) {
            moves += Math.abs(B[i] - median);
            moves %= MOD;
        }

        return (int)(moves % MOD);
    }
}
