/* Structure of Linked List Node
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
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node newnode = new Node(val);
        Node temp = head;
        if(pos==1){
            newnode.next = head;
            head = newnode;
            return head;
        }
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        if(temp.next==null){
            temp.next = newnode;
            return head;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }
}