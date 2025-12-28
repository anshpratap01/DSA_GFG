/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    public int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public int diameter(Node root) {
        if(root == null) return 0;
        int leftans = diameter(root.left);
        int rightans = diameter(root.right);
        int mid = height(root.left) + height(root.right);
        //if(root.left != null) mid++;
        //if(root.right != null) mid++;
        int  max = Math.max(leftans,Math.max(rightans,mid));
        return max;
        
        
        
    }
}