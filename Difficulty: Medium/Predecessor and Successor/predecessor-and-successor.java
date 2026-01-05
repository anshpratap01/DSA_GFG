/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public static void inorder(Node root , ArrayList<Node> ans){
        if(root == null) return ;
        inorder(root.left,ans);
        ans.add(root);
        inorder(root.right,ans);
        
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
       ArrayList<Node> ans = new ArrayList<>();
       ArrayList<Node> arr = new ArrayList<>();
       inorder(root,ans);
      
      
       
       Node pre = null;
        Node suc = null;

        for (Node node : ans) {
            if (node.data < key) {
                pre = node;           // keep updating predecessor
            } else if (node.data > key && suc == null) {
                suc = node;           // first greater element
            }
        }

        ArrayList<Node> result = new ArrayList<>();
        result.add(pre);   // may be null
        result.add(suc);   // may be null

        return result;
        
    }
}