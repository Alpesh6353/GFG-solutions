class Solution {
  public:
    int floorSqrt(int n) {
        // code here
        int ans = 1;
        int lo = 1;
        int hi = n;
        long a = n;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if(mid*mid==a){
                return mid;
            }
            else if(mid*mid<a) lo = mid+1;
            else hi = mid-1;
        }
        return hi;
    }
};