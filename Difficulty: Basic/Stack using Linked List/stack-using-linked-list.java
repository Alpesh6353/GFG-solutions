/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {
    
    Node head;
    int len;
    public myStack() {
        head=null;
        len=0;
    }

    public boolean isEmpty() {
        if(len==0) return true;
        else return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node temp = new Node(x);
        if(len==0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }

    public void pop() {
        // Removes the front element of the stack.
        head = head.next;
        len--;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(len==0) return -1;
        else return head.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return len;
    }
}
