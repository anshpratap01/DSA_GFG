class Solution {
    static int dp[][];
    public static  int lcs(String s1 , String s2 , int n , int m){
        if(n == 0 || m== 0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] =  1 + lcs(s1,s2,n-1,m-1);
        }else{
        
            int take = lcs(s1,s2,n-1,m);
            int notake = lcs(s1,s2,n,m-1);
            dp[n][m] =  Math.max(take,notake);
        }
        return dp[n][m];
        
    }
    public static int minSuperSeq(String s1, String s2) {
        // code he
        
        int n = s1.length();
        int m = s2.length();
        dp = new int[n+1][m+1];
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=m ; j++){
                dp[i][j] = -1;
            }
        }

        return (m+n) - lcs(s1,s2,n,m);
    }
}