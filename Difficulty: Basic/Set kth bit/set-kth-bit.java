// User function Template for Java
class Solution {
    static int setKthBit(int n, int k) {
        int d = 1<<k;
        return  (n|d);
        
    }
}