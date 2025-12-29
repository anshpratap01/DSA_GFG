/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
ArrayList<Integer> zigZagTraversal(Node root) {
    ArrayList<Integer> ans = new ArrayList<>();
    if (root == null) return ans;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    boolean leftToRight = true;

    while (!q.isEmpty()) {
        int size = q.size();
        ArrayList<Integer> level = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Node curr = q.poll();

            if (leftToRight) {
                level.add(curr.data);
            } else {
                level.add(0, curr.data); // insert at front
            }

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }

        ans.addAll(level);
        leftToRight = !leftToRight;
    }

    return ans;
}

}