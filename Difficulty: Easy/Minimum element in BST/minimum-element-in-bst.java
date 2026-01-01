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
    public int minValue(Node root) {
        Node curr = root;
        while(curr.left != null){
            curr = curr.left;
        }
        return  curr.data;
        
    }
}