class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int n = arr.length;
       
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==k) return mid;
            else if(arr[mid]>k) hi = mid-1;
            else lo = mid+1;
        }
        return hi+1;
    }
};