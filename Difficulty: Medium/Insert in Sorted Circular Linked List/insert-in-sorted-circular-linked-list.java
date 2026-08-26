/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node curr= head,next=head.next;
        Node new_node = new Node(data);
        while(true){
            if(curr.data <= data && next.data >= data){
                new_node.next = next;
                curr.next = new_node;
                break;
            }
            else if(curr.data > next.data && curr.data <= data){
                new_node.next = next;
                curr.next = new_node;
                break;
            }
            else if(curr.data > next.data && next.data > data){
                new_node.next = next;
                curr.next = new_node;
                head = new_node;
                break;
            }
            next = next.next;
            curr = curr.next;
        }
        return head;
    }
}