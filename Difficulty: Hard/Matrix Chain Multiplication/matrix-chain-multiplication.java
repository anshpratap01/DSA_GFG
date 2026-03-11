class Solution {
    static int dp[][];
    public static int solve(int arr[]  , int i , int j ){
        if(i>=j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;

        for(int k = i; k<j; k++){
          int x = solve(arr, i , k) + solve(arr, k+1, j) + arr[i-1] * arr[k] * arr[j];  
        
           if(x < min){
            min = x;
            dp[i][j] = min;
           } 

        }
        return dp[i][j];
    }
    static int matrixMultiplication(int arr[]) {
    int i = 1;
    int j = arr.length-1;
    dp = new int[101][101];
    for(int ii = 0; ii<dp.length; ii++){
        for(int jj = 0; jj<dp.length; jj++){
            dp[ii][jj] = -1;
        }
    }
    int cost = solve(arr,i,j);
    return cost;
       
        
    }
}