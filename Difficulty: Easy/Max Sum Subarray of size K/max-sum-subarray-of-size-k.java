class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i = 0;
        int j = 0;
        
        while(j<arr.length){
            sum = sum+arr[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1 == k){
                max = Math.max(sum , max);
                sum = sum-arr[i];
                i++;
                j++;
            }
        }
        return max;
        
    }
}