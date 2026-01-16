// User function Template for Java

class Solution {
    
    public static int mean(int arr[] , int idx, int n, int sum){
        if(idx == arr.length){
            return  sum / n;
        }
        sum = sum + arr[idx];
        return mean(arr,idx+1,n,sum);
    }
    public static int findMean(int[] arr) {
        int n = arr.length;
       return mean(arr,0,n,0);
        
    }
};