class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) { 
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i = 0; i<arr.length; i++){
            mp.put(arr[i],1+mp.getOrDefault(arr[i],0));
            
        }
        
        for(var e : mp.keySet()){
            if(mp.get(e)>1){
                ans.add(e);
            }
        }
        return ans;
        
    }
}