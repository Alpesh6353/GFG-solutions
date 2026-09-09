class Solution {
    public boolean isBalanced(String s) {
        // code here
        int n = s.length();
        if(n==1 || s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)=='}' ) return false;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else {
                if(st.size()==0) return false;
                char ch = st.pop();
                if((s.charAt(i)==')' && ch == '(')||
                (s.charAt(i)==']' && ch == '[') ||
                (s.charAt(i)=='}' && ch == '{')) continue;
                else return false;
            }
        }
        if(st.size() == 0) return true;
        else return false;
    }
}
