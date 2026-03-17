class Solution {
    int dp[];
    public int solve(int arr[] , int n){
        if(n<=0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int take = arr[n-1] + solve(arr , n-2);
        int notake  = solve(arr , n-1);
        dp[n] =  Math.max(take, notake);
        return dp[n];
    }
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        dp = new int[n+1];
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
        }
        // int n  = arr.length;
        return solve(arr , n);
        
    }
}