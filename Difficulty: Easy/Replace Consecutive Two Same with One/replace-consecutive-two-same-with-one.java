class Solution {
    public String removeDuplicates(String s) {
        // code here
        int n = s.length();
        if(n==1) return s;
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++){
            if(st.size()>=1 && s.charAt(i)==st.peek()) continue;
            else st.push(s.charAt(i));
        }
        while(!st.isEmpty()) ans.append(st.pop());
        ans.reverse();
        return ans.toString();
    }
}