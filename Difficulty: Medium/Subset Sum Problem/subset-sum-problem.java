class Solution {
    static boolean dp[][];

    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        dp = new boolean[n+1][sum+1];
        
                for(int i = 0; i <= n; i++){
            dp[i][0] = true;   // sum 0 is always possible
        }
        
        for(int j = 1; j <= sum; j++){
            dp[0][j] = false;  // with 0 elements, positive sum not possible
        }
        
        for(int i= 1; i<=n; i++){
            for(int j = 1; j<=sum; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
        
        
    }
}