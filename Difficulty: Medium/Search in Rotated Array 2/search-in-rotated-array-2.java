class Solution {
    public boolean search(int[] arr, int key) {
        // code here
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==key || arr[hi]==key || arr[lo]==key) return true;
            if(arr[lo]<=arr[mid]){
                if(arr[lo]<=key && arr[mid]>key) hi = mid-1;
                else if(arr[mid]==arr[lo] && arr[mid]==arr[hi]) {
                    hi--;
                    lo++;
                }
                else lo = mid+1;
            }
            else{
                if(arr[hi]>=key && arr[mid]<key) lo = mid+1;
                else if(arr[mid]==arr[lo] && arr[mid]==arr[hi]) {
                    hi--;
                    lo++;
                }
                else hi = mid-1;
            }
            
        }
        return false;
    }
}
