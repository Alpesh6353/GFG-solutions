class Solution {
    public void segregateElements(int[] arr) {
        // code here
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[j] = arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[j] = arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = ans[i];
        }
    }
}