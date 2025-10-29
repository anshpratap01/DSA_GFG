// User function Template for Java

class Solution {
   
    public static int[] fibonacciNumbers(int n) {
        
                int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    

    }
}