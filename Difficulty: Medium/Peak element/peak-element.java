class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;

        // Edge cases
        if (n == 1) return 0; // only one element — it's a peak

        // Check first element
        if (arr[0] > arr[1]) return 0;

        // Check last element
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }

        // If somehow no peak (shouldn't happen), return -1
        return -1;
    }
}
