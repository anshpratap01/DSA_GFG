import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i = 0; i<a.length; i++){
            mp.put(a[i],1+mp.getOrDefault(a[i],0));
            
        }
        for(int i = 0; i<b.length; i++){
            mp.put(b[i],1+mp.getOrDefault(b[i],0));
            
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(var e : mp.keySet()){
            ans.add(e);
            
        }
        Collections.sort(ans);
        return ans;
    }
}
