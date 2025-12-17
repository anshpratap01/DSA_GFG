class Solution {
    public int longestKSubstr(String s, int k) {
        int i = 0;
        int j = 0;
        int  max = -1;
        
        HashMap<Character,Integer > mp = new HashMap<>();
        
        while(j<s.length()){
            char ch = s.charAt(j);
            mp.put(ch,1+ mp.getOrDefault(ch,0));
            
            if(mp.size()<k){
                j++;
            }else if(mp.size() == k){
                max = Math.max(j-i+1, max);
                j++;
            }else if(mp.size()>k){
                while(mp.size()> k){
                    char left = s.charAt(i);
                    mp.put(left,mp.get(left)-1);
                    if(mp.get(left) == 0){
                        mp.remove(left);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
        
    }
}