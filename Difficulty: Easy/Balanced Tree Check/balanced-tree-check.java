/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root){
        if(root ==  null) return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(Node root) {
        if(root == null) return true;
        int lh = height(root.left);
        int rh  = height(root.right);
        int d = Math.abs(lh-rh);
        if(d>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
}