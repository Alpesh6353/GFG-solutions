class Solution {
    int search(int[] arr, int key) {
        // code here
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + ( hi -lo )/2;
            if(arr[mid]==key) return mid;
            if(arr[lo]<=arr[mid]){
                if(arr[mid]>key && arr[lo]<=key) hi = mid-1;
                else lo = mid+1;
            }
            else{
                if(arr[mid]<key && arr[hi]>=key) lo = mid+1;
                else hi = mid-1;
            }
        }
        return -1;
    }
}