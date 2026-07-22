class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max = arr[i];
            sum += arr[i];
        }
        int lo = 1;
        int hi = max;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int hours = 0;
            int sum2 = 0;
            for(int i=0;i<n;i++){
                if(arr[i]%mid==0){
                    sum2 = arr[i]/mid;
                    hours += sum2;
                }
                else{
                    sum2 = arr[i]/mid + 1;
                    hours += sum2;
                }
            }
            if(hours<=k){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}
