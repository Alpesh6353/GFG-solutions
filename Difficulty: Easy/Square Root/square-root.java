class Solution {
    int floorSqrt(int n) {
        // code here
        if(n==1) return 1;
        int lo = 2;
        int hi = n;
        int ans = 1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid*mid==n) return mid;
            else if(mid*mid<n){
                ans = mid;
                lo = mid+1;
            }
            else hi = mid-1;
        }
        return ans;
    }
}