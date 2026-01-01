/*
class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    Node lca(Node root, int p, int q) {
        if(root == null) return null;
        if( p == root.data || q==root.data) return root;
        //if( p == q) return p;
        Node l = lca(root.left , p ,q);
        Node r = lca(root.right , p ,q);
        if(l != null && r != null) return root;
        if(l == null) return r;
        else return l;
        
    }
}