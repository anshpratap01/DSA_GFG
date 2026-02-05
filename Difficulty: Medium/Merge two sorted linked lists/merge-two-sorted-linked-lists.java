/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        
        if(head1 == null) {
            return head2;
        }
        
        if(head2 == null){
            return head1;
        }
        Node res;
        
        if(head1.data < head2.data){
            res = head1;
            res.next = sortedMerge(head1.next, head2);
        }else{
            res = head2;
            res.next = sortedMerge(head1, head2.next);
        }
        
        return res;
 
    }
}