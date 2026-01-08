/*
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/


class Solution {
    public  static  void inorder(Node root,ArrayList<Integer> ans){
        if(root == null) return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    Node balanceBST(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return  build(ans,0,ans.size()-1);
        

    }
    public static Node build(ArrayList<Integer> ans,int lo, int hi){
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        Node root = new Node(ans.get(mid));
        root.left = build(ans, lo ,mid-1);
        root.right = build(ans, mid+1 , hi);
        return root;
        
    }
}