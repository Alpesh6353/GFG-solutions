/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node temp = head;
        if(x==1) return head = head.next;
        for(int i=1;i<x-1;i++){
            temp = temp.next;
        }
        if(temp.next == null){
            temp = null;
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }
}