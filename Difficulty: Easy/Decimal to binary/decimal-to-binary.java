class Solution {
    static String decToBinary(int n) {
        String binary = "";
        while(n>0){
           binary = (n%2)+binary;
           n = n/2;
        }
        return binary;
    }
}