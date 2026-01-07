/* A Binary Tree node

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    public static String solve(Node root , HashMap<String , Integer> mp ){
        if(root == null) return "N" ;
        if(root.left == null && root.right == null) return String.valueOf(root.data);
        String l = solve(root.left,mp);
        String r = solve(root.right,mp);
        String curr = "";
        curr += root.data;
        curr += "*";
        curr += l;
        curr += "*";
        curr += r;
       
        mp.put(curr,1+mp.getOrDefault(curr,0));
        return curr;
        
    }
    int dupSub(Node root) {
       HashMap<String , Integer> mp = new HashMap<>();
       solve(root, mp);
       for( var e : mp.keySet()){
           if(mp.get(e) >1) return 1;
       }
       return 0;
        
    }
}