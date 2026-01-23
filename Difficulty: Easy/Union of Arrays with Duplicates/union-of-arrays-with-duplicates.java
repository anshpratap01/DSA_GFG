class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> ans =   new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();
        for(int ele : b){
            st.add(ele);
        }
        
        for(int ele : a){
            st.add(ele);
        }
        
        
        
        for(var  e : st){
            ans.add(e);
        }
        
        return ans;
        
    }
}