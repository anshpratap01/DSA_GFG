class Solution {
    static  Boolean dp[][];
      static boolean issubset(int arr[] , int sum , int n){
          if(sum == 0 ){
              return true;
          }
          if(n == 0 && sum != 0){
              return false;
          }
          if(dp[n][sum] != null){
          return dp[n][sum];
          }
          
          
          if(arr[n-1] <= sum){
              boolean take = issubset(arr, sum-arr[n-1] , n-1);
              boolean notake = issubset(arr,sum,n-1);
              dp[n][sum] = take || notake;
          }
          else{
              dp[n][sum] =  issubset(arr,sum,n-1);
          }
          return dp[n][sum];
      }
    static Boolean isSubsetSum(int arr[], int sum) {
        
        int n = arr.length;
        dp = new Boolean [n+1][sum+1];
        
        
        return issubset(arr,sum,n);
        
    }
}