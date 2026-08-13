/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head ==null  || head.next == null) return head;
        Node zero = new Node(0);
        Node one = new Node(0);
        Node two = new Node(0);
        Node tz = zero;
        Node to = one;
        Node tt = two;
        Node temp = head;
        while(temp != null){
            if(temp.data==0){
                tz.next = temp;
                tz = tz.next;
            }
            else if(temp.data==1){
                to.next = temp;
                to = to.next;
            }
            else{
                tt.next = temp;
                tt = tt.next;
            }
            temp = temp.next;
        }
        tt.next = null;
        to.next = two.next;
        tz.next = one.next;
        return zero.next;
    }
}