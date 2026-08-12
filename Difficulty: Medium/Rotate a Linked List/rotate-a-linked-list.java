/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(k==0 || head==null || head.next==null) return head;
        Node temp = head;
        Node temp2 = null;
        int count = 0;
        while(temp != null){
            temp2 = temp;
            temp = temp.next;
            count++;
        }
        if(count<k) k = k%count;
        if(count==k || k==0) return head;
        temp = head;
        for(int i=1;i<k;i++){
            temp = temp.next;
        }
        Node a = temp.next;
        temp2.next = head;
        temp.next = null;
        head = a;
        return head;
    }
}