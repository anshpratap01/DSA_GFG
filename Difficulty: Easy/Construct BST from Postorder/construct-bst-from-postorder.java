/*class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

// Function should return the root of the bst formed using postorder traversal.
class GFG {
    
    static int index;
    static Node constructTree(int[] arr , int lower , int upper){
        
        if(index<0 || arr[index]<lower || arr[index]>upper) return null;
        
        Node root = new Node(arr[index--]);
        
        root.right = constructTree(arr , root.data , upper);
        root.left = constructTree(arr , lower , root.data);
        
        return root;
    }
    
    public static Node constructTree(int post[], int n) {
        
        index = n-1;
        
        return constructTree(post , Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
}