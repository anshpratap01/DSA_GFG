// User function Template for Java

class Solution {
    public static void preorder(Node root , ArrayList<Node> ans ){
        if(root == null) return ;
        ans.add(root);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public static void flatten(Node root) {
        // code here
         if(root == null) return;

        ArrayList<Node> ans = new ArrayList<>();
        preorder(root,ans);

        for(int i = 0; i<ans.size()-1;i++){
            Node a = ans.get(i);
            Node b = ans.get(i+1);
            a.right = b;
            a.left = null;

        }
        int n = ans.size()-1;
        Node last = ans.get(n);
        last.left = null;
        last.right = null;
        
    }
}