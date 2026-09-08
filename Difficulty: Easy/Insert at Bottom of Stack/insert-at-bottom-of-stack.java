class Solution {
    public void AddElement(Stack<Integer> st,int ele){
          if(st.size()==0){
            st.push(ele);
            return;
          }
          int x = st.pop();
          AddElement(st,ele);
          st.push(x);
        }
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        AddElement(st,x);
        return st;
    }
}