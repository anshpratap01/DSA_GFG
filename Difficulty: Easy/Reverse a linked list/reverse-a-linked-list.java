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
    Node reverseList(Node head) {
       Node curr = head;
       Node prev = null;
       Node agla = null;
       
       while(curr != null){
           agla = curr.next;
           curr.next = prev;
           prev = curr;
           curr = agla;
       }
       return prev;
        
    }
}