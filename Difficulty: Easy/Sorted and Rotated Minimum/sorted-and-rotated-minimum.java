// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0; i<n;i++){
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        return min;
    }
}
