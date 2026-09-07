class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        
       List<List<Integer>> ans = new ArrayList<>();
       
        
        for(int i = 0; i<n; i++){
            ArrayList <Integer> a = new ArrayList<>();
            
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    a.add(1);
                }else{
                    
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    a.add(val);
                }
                
                
            }
            ans.add(a);
            
        }
        
     return new ArrayList<>(ans.get(n-1));
            
        
        
        
    }
}