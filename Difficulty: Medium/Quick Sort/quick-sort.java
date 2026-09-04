class Solution {
    
    public void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        
        arr[j] = temp;
    }
    public void quickSort(int[] arr, int low, int high) {
        if(low >=high){
            return;
        }
        
        int pivot = partition(arr , low , high);
        quickSort(arr , low  , pivot-1);
        quickSort(arr , pivot+1 , high);
        
        // code here
        
    }

    private int partition(int[] arr, int low, int high) {
        
        
        int pivot = arr[high];
        int pidx = low;
        
        for(int i = low ; i<high ; i++){
            
            if(arr[i] <= pivot){
                swap(arr , i , pidx);
                pidx++;
            }
            
        }
        
          swap(arr , high , pidx);
          
          return pidx;
        // code here
        
    }
}