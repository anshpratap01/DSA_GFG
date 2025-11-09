class Solution {
    public int nthRoot(int n, int m) {
        if (m == 0) return 0; // ✅ handle 0^n = 0
        if (m == 1) return 1; // ✅ handle 1^n = 1

        int lo = 1, hi = m;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int result = check(mid, n, m);

            if (result == 0) return mid;      // mid^n == m
            else if (result == 1) hi = mid - 1; // mid^n > m
            else lo = mid + 1;                // mid^n < m
        }

        return -1; // not a perfect nth root
    }

    private int check(int mid, int n, int m) {
        long val = 1;
        for (int i = 0; i < n; i++) {
            val *= mid;
            if (val > m) return 1;  // early stop if exceeds
        }
        if (val == m) return 0;
        return -1;
    }
}
