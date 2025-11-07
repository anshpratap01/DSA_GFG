// User function Template for Java

class GFG {
    public int lastoccurance(int arr[],int k){
       int start = 0;
       int lastt = -1;
       int end  = arr.length-1;
       while(start<=end){
           int mid = start+(end-start)/2;
           
           if(arr[mid] == k){
               lastt = mid;
               start = mid +1;
           }
           else if (arr[mid]>k){
               end = mid-1;
           }else{
               start = mid+1;
           }
          
        
    }
    return lastt;
        
    }
    public int firstoccuance(int arr[],int k){
       int start = 0;
       int firstt = -1;
       int end  = arr.length-1;
       while(start<=end){
           int mid = start+(end-start)/2;
           
           if(arr[mid] == k){
               firstt = mid;
               end = mid-1;
           }
           else if (arr[mid]>k){
               end = mid-1;
           }else{
               start = mid+1;
           }
          
        
    }
    return firstt;
    
    }
    ArrayList<Integer> find(int arr[], int k) {
       ArrayList<Integer>  ans =  new ArrayList<>();
       int first = firstoccuance(arr,k);
       int last =  lastoccurance(arr,k);
       ans.add(first);
       ans.add(last);
       return ans;
       
        
    }
    
    }

