class Solution {
    public int findMin(int[] arr) {
        // code here
        int n = arr.length;
        int lo = 1;
        int hi  = n-2;
        int max = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
                max = mid;
                break;
            }
            else if(arr[lo-1]>arr[mid]) hi = mid-1;
            else lo = mid+1;
        }
        if(max==-1) return Math.min(arr[0],arr[n-1]);
        else return arr[max];
    }
}
