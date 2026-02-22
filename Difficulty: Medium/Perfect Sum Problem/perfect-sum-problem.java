class Solution {
    int dp[][];
    
    public int  issubset(int nums[] , int sum , int n){
        if(n == 0){
            if(sum == 0) return 1;
            else return 0;
        }
        
        if(dp[n][sum] != -1){
            return dp[n][sum];
        }
        
        if(nums[n-1] <= sum){
            int take = issubset(nums,sum- nums[n-1] , n-1);
            int notake = issubset(nums, sum, n-1);
            dp[n][sum] =  notake + take;
            
            
        }else{
        dp[n][sum] = issubset(nums,sum,n-1);
        }
        return dp[n][sum];
        
    }
    public int perfectSum(int[] nums, int target) {
        int n =  nums.length;
        dp = new int[n+1][target+1];
        
       for(int i = 0; i<=n ;i++){
           for(int j = 0; j<=target; j++){
               dp[i][j] = -1;
           }
       }
        //cnt = 0;
        
        return  issubset(nums,  target,  n);
        
        
        
        
    }
}