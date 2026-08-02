class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n-1];
        int seclargest = -1;
       
       for(int i = n-2; i>=0; i--){
           if(arr[i] < largest){
               seclargest = arr[i];
               break;
           }
       }
        return seclargest;
    }
}