class Solution {
    int dp[][];
    public int rod(int price[] , int len[], int l , int n){
        if(l == 0 ||  n == 0){
            return 0;
        }
        if(dp[n][l] != -1){
            return dp[n][l];
        }
        
        if(len[n-1] <= l){
            int take = price[n-1] + rod(price,len , l - len[n-1] , n);
            int notake = rod(price , len , l , n-1);
            dp[n][l] = Math.max(take ,notake);
        }else{
        
        dp[n][l] =  rod(price , len , l , n-1);
        }
        return dp[n][l];
    }
    public int cutRod(int[] price) {
        int l = price.length;
        int n = price.length;
        int len[] = new int[l];
        
        dp = new int[n+1][l+1];
        for(int  i = 0; i<=n; i++){
            for(int j  = 0; j<=l; j++){
                dp[i][j] = -1;
            }
        }
        for(int i = 0; i<l; i++){
            len[i] = i+1;
        }
        
        return rod(price, len , l ,n);
        
    }
}