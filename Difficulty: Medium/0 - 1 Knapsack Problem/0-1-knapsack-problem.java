class Solution {
    int dp[][];
    public int knap(int w,int val[], int wt[], int n){
        if(n == 0 || w == 0) {
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if(wt[n-1] <= w){
            int take = val[n-1] +  knap(w-wt[n-1] ,val,wt,n-1);
            int nottake = knap(w,val,wt,n-1);
            dp[n][w] = Math.max(take ,nottake);
        }else{
        
            dp[n][w] =   knap(w,val,wt,n-1);
        }
        return dp[n][w];
        
    }
    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
         dp = new int[n+1][W+1];
        for(int i = 0; i<=n;i++){
            for(int j = 0; j<=W;j++ ){
                dp[i][j] = -1;
            }
        }
        return knap(W,val,wt,n);
        
    }
}
