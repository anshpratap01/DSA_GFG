class Solution {
    public void Swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    public void sort012(int[] arr) {
       int n = arr.length;
       int lo = 0;
       int mid = 0;
       int high = n-1;
       
       while(mid <= high){
           if(arr[mid] == 0){
               Swap(arr, mid , lo);
               lo++;
               mid++;
           }
           else if(arr[mid] == 1){
               mid++;
           }
           else{
              
              Swap(arr,mid,high);
              high--;
              
           }
       }
                
                
    }
}