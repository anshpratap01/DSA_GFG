class Solution {
    public static int gcd(int a , int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public int lcm(int a, int b) {
        int hcf = gcd(a,b);
        int ans = (a*b)/hcf;
        return ans;
        
    }
}