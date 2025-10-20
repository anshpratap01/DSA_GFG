// User function Template for Java
import java.util.*;
class Solution {
    public void  subset(String ans, String s, int idx,  List<String> a){
        if(idx == s.length() ){
            a.add(ans);
            return;
        }
        
        
        char ch = s.charAt(idx);
        subset(ans+ch,s,idx+1,a);
        subset(ans,s,idx+1,a);
        
    
    }
    public List<String> AllPossibleStrings(String s) {
         List<String> a = new ArrayList<>();
         String ans = "";
         int idx = 0;
         subset(ans,s,idx,a);
         Collections.sort(a);
         return a;
         

    }
}