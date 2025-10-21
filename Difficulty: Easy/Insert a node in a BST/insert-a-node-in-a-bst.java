/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node insert(Node root, int key) {
       if(root == null) return new Node(key);

        if(root.data>key){
            if(root.left == null){
                root.left = new Node(key);
            }else{
                insert(root.left,key);

            }
        }else{
            if(root.right == null){
                root.right = new Node(key);
            }else{
                insert(root.right,key);
            }
        }
        return root;
    }
}
