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
}
*/

class Solution {
    public Node LCA(Node root, Node n1, Node n2) {
        if(root == null) return null;
        if(n1 == root ||  n2 == root) return root;
        //if(n1 == n2) return n1;
        
        Node l = LCA(root.left,n1,n2);
        Node r = LCA(root.right,n1,n2);
        if(l != null && r != null ) return root;
        if(l != null && r == null) return l;
        if(l == null && r != null) return r;
        return null;
        
        
    }
}