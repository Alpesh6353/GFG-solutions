class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max = arr[i];
        }
        int lo = 1;
        int hi = max;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int div = 0;
            for(int i=0;i<n;i++){
                if(arr[i]%mid==0) div += arr[i]/mid;
                else div += arr[i]/mid +1;
            }
            if(div<=k){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}