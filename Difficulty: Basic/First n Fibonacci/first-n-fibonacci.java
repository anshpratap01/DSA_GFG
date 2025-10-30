// User function Template for Java

class Solution {
    public static  int fib(int m){
        if(m == 0 || m == 1) return m;
        return fib(m-1) + fib(m-2);
    }
    
    public static int[] fibonacciNumbers(int n) {
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = fib(i);
        }
        return arr;

        
    }
}