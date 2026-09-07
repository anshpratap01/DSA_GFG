class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i = 0; i<arr.length-2 ; i++){
            
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            
            int left = i+1;
            int right = arr.length-1;
            
            
            while(left < right){
                
                int sum = arr[i]+ arr[left] + arr[right];
                
                if(sum == 0){
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[left]);
                    a.add(arr[right]);
                    ans.add(a);
                
                
                if(left< right && arr[left] == arr[left+1]){
                    left++;
                }
                if(left < right && arr[right] == arr[right-1]){
                    right--;
                }
                left++;
                right--;
                }if(sum < 0){
                    left++;
                }
                
                if(sum > 0){
                    right--;
                }
                
                
            }
            
        }
        return ans;
    
    }
}
