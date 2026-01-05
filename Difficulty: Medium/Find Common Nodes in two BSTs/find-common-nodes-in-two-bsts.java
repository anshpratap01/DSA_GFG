class Solution {
    // Function to find the nodes that are common in both BST.
    public static void preorder(Node root ,HashMap<Integer,Integer> mp ){
        if(root == null) return ;
        mp.put(root.data , 1+mp.getOrDefault(root.data ,0));
        preorder(root.left,mp);
        preorder(root.right,mp);
    }
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        preorder(r1, mp);
        preorder(r2,mp);
        ArrayList<Integer> arr = new ArrayList<>();
        for(var e : mp.keySet()){
            if(mp.get(e) >1){
                arr.add(e);
            }
        }
        Collections.sort(arr);
        return arr;
        
        
        
        
    }
}