// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        int n = b.length();
        int sum = 0;
        int pow = 1;
        
        StringBuilder sb = new StringBuilder(b);
        
        sb.reverse();
        
        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == '1'){
               
                sum = sum+pow;
            }
            pow = pow*2;
            
            
        }
        return sum;
       
        
    }
}