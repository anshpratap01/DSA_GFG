/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) { 
        if(head == null) return false;
        if(head.next == null) return false;
        Node slow = head;
        Node fast = head;
        
        while(fast != null){
            if(slow ==  null) return false;
             slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(fast == slow) return true;
            
        }
       
        return false;

        
    }
}