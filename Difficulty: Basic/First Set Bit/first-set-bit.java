// User function Template for Java

class Solution {
    static int findPosition(int n) {
        int count = 0;
        int ans = -1;
        for(int i = 0; i<32; i++){
            if((n&(1<<i)) !=0) {
                count++;
            ans = i+1;
            }
        }
        if(count == 1) return ans;
        else return -1;
    }
};