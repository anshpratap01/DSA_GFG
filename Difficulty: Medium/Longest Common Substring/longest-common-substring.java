class Solution {
    int dp[][];
    public int solve(String s1, String s2 , int n , int m){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=m; j++){
                if( i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i = 1;i <=n; i++){
            for(int j = 1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] =  1+ dp[i-1][j-1];
                    max = Math.max(dp[i][j] , max);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        if(max == Integer.MIN_VALUE){
            return 0;
        }
        return max;
        
        
    }
    
    public int longCommSubstr(String s1, String s2) {
        
        int n = s1.length();
        int m = s2.length();
        
        dp = new int[n+1][m+1];
        
        return solve(s1,s2,n,m);
        
    }
}