/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            
            ArrayList<Integer> curr = new ArrayList<>();
            
            int size= q.size();
            
            for(int i = 0 ;i<size; i++ ){
                Node a = q.poll();
                  curr.add(a.data);
                if(a.left != null){
                    q.add(a.left);
                }
                if(a.right != null){
                    q.add(a.right);
                }
            }
            ans.add(curr);
            
            
        }
        return ans;
        
        
        
    }
}