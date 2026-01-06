/*Complete the finction below
Node is as follows
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class Solution {
    public int maxLevelSum(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.size()>0){
            int currsum = 0;
            int  n = q.size();
            for(int i = 0; i<n; i++){
                Node curr = q.poll();
                currsum = currsum + curr.data;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            ans.add(currsum);
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<ans.size(); i++){
            max = Math.max(max,ans.get(i));
        }
        return max;
    }
}