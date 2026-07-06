class Solution {
    public int countOnes(int[] arr) {
        // code here
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==1) lo = mid+1;
            else hi = mid-1;
        }
        return hi+1;
    }
}