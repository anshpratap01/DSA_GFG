
// User function Template for Java
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        ArrayList<Integer> bfss = new ArrayList<>();
        boolean[] visted = new boolean[V];
         Queue<Integer> q = new LinkedList<>();
         q.add(0);
         visted[0] = true;
         
         while(!q.isEmpty()){
             int curr = q.poll();
             bfss.add(curr);
         
         //ArrayList<Integer> neighbour = adj.get(curr);
         for (int j = 0; j < adj.get(curr).size(); j++) {
                int neighbor = adj.get(curr).get(j);
                if (!visted[neighbor]) {
                    visted[neighbor] = true;
                    q.add(neighbor);
             }
         }
         }
       
      return bfss;  
    }
}

