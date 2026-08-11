/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node temp = head;
        while(temp.next != null){
           Node swap = temp.prev;
           temp.prev = temp.next;
           temp.next = swap;
           temp = temp.prev;
        }
        Node swap = temp.prev;
        temp.prev = temp.next;
        temp.next = swap;
        head = temp;
        return temp;
    }
}