/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
     public  static void inorder(Node root, ArrayList<Integer> ans){
        if(root == null) return ;
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
    public boolean isBST(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
       
        for(int i = 1; i< ans.size(); i++ ){
            if(ans.get(i-1) >= ans.get(i)){
                return false;
            }
           
        }
       return true;
        
    
        
    }
}