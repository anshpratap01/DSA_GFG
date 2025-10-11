/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        int count1 = 0;
        Node temp = head1;
        while(temp != null){
            count1++;
            temp = temp.next;
        }
        Node temp2 = head2;
        int count2 = 0;
        while(temp2 != null){
            count2++;
            temp2 = temp2.next;
        }
        
        if(count1 > count2){
            int steps = count1-count2;
            for(int i = 1; i<=steps;i++){
                head1 = head1.next;
                
            }
        }
        else{
            int steps2 = count2-count1;
            for(int i = 1; i<=steps2; i++){
                head2 = head2.next;
            }
        }
        while (head1 != head2){
            head1 = head1.next;
            head2= head2.next;
        }
         return head1;
        
    }
}