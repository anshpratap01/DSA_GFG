/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */

class Solution {
    public static void inorder(Node root, ArrayList<Node> ans ){
        if(root == null) return;
        inorder(root.left,ans);
        ans.add(root);
        inorder(root.right,ans);
        
        
    }
    public static void transformTree(Node root) {
        ArrayList<Node> ans = new ArrayList<>();
        inorder(root,ans);
        Collections.reverse(ans);
        int sum = 0;
        for(int i = 0; i<ans.size(); i++){
            int val = ans.get(i).data;
            ans.get(i).data = sum;
            sum = sum+val;
        }
        
        
    }
}