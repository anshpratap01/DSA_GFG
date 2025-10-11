/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    public int  size(Node head){
        Node temp = head;
        int sizee = 0;
        while(temp != null){
            
            
            temp= temp.next;
            sizee = sizee+1;
        }
        return sizee;
    }
    int getKthFromLast(Node head, int k) {
        int n = size(head);
        if(head == null || k>n){
            return -1;
        }
        
        for(int i = 1; i<=n-k;i++){
            head = head.next;
            
        }
        return head.data;
      
        
    }
}