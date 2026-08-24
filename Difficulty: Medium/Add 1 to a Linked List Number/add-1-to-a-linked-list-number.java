/* Structure of linked list Node
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
    public Node addOne(Node head) {
        // code here.
        if(head==null) return head;
        if(head.next == null){
            if(head.data<9){
                head.data = head.data+1;
                return head;
            }
        }
        Node temp = head;
        Node prev = null;
        head = head.next;
        while(temp != null){
            temp.next = prev;
            prev = temp;
            temp = head;
            if(head != null) head = head.next;
        }
        head = prev;
        temp = head;
        int carry = 1;
        Node past = null;
        while(temp != null){
            carry += temp.data;
            if(carry != 10){
                temp.data = carry;
                carry /= 10;
            }
            else {
                temp.data = carry%10;
                carry /= 10;
            }
            past = temp;
            temp = temp.next;
        }
        if(carry != 0){
            Node new_node = new Node(1);
            past.next = new_node;
        }
        temp = head;
        prev = null;
        head = head.next;
        while(temp != null){
            temp.next = prev;
            prev = temp;
            temp = head;
            if(head != null) head = head.next;
        }
        head = prev;
        return head;
    }
}