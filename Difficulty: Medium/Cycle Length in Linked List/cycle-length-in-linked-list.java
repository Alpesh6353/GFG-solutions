/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(fast == null || fast.next == null) return 0;
        int count = 1;
        while(fast.next != slow){
            count++;
            fast = fast.next;
        }
        return count;
    }
}