class Solution {
    public int findFloor(int[] arr, int x) {
        int n = arr.length;
        for(int  i = n-1; i>=0; i--){
            if(arr[i]<=x){
                return i;
            }
        }
        return -1;
        
        
    }
}
