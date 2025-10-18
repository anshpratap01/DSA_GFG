class Solution {
    public void sortStack(Stack<Integer> st) {
        int n = st.size();
        int arr[] = new int[n];
        int idx = 0;
        while(st.size()>0){
            arr[idx] = st.pop();
            idx++;
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i<arr.length; i++){
            st.push(arr[i]);
        }
        // System.out.print(st);
    }
}