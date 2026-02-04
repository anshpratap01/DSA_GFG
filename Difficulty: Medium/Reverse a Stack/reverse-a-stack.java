class Solution {
    public static void insertAtBottom(Stack<Integer> st,int top){
        if(st.size() == 0){
            st.push(top);
            return;
        }
        int curr = st.pop();
        
        insertAtBottom(st,top);
        st.push(curr);
        
        
    } 
    public static void reverseStack(Stack<Integer> st) {
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st,top);
        
        
    }
}
 