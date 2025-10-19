class Solution {
    public int reverseExponentiation(int n) {
        int o = n;
        int reverse = 0;
        while(n>0){
        int last = n%10;
        reverse = reverse*10+last;
        n= n/10;
        
        }
        
        
        int ans  = (int)Math.pow(o,reverse);
        return ans;
        
    }
}
