/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        // code here
        List<List<Integer>> ans = new ArrayList<>();
        if(head==null) return ans;
        Node temp = head;
        Node lastnode = null;
        List<Integer> r1 = new ArrayList<>();
        while(temp != null){
            r1.add(temp.data);
            lastnode = temp;
            temp = temp.next;
        }
        ans.add(r1);
        List<Integer> r2 = new ArrayList<>();
        temp = lastnode;
        while(temp != null){
            r2.add(temp.data);
            temp = temp.prev;
        }
        ans.add(r2);
        return ans;
    }
}