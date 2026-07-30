/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = new Node(x);
        Node a = head;
        if(head==null) return temp;
        while(a != null &&  a.next != null){
            a = a.next;
        }
        a.next = temp;
        return head;
    }
}