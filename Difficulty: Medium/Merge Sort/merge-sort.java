class Solution {
    public void mergeSort(int arr[], int l, int r) {
         if(l >= r){
             return;
         }
        int mid = l+(r-l)/2;
        mergeSort(arr, l , mid);
        mergeSort(arr, mid+1 , r);
        merge(arr , l , mid , r);
       
        
    }
    
    public void merge(int arr[] , int l , int m , int r){
        int n1 = m-l+1;
        int n2 = r-m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        int k = l;
        
        for(int i = 0; i<n1; i++){
            L[i] = arr[k++];
            
        }
        
        for(int j =0; j<n2; j++){
            R[j] = arr[k++];
            
        }
        
        k = l;
        
        int i = 0;
        int j = 0;
        
        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
                
                
            }else{
                arr[k] = R[j];
            
                j++;
            }
            k++;
        }
        
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
        
        
    }
}