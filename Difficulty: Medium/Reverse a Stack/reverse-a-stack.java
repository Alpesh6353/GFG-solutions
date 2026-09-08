class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        int n = st.size();
        int[] arr = new int[n];
        int i = 0;
        while(st.size()>0){
            arr[i++] = st.pop();
        }
        for(int k=0;k<n;k++){
            st.push(arr[k]);
        }
    }
}
