class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int D) {
        // code here
         int n = arr.size(); // length of weights array
        int totalsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr.get(i)>max) max = arr.get(i);
            totalsum += arr.get(i);
        }
        int lo = max;
        int hi = totalsum;
        int ans=0;
        while(lo<=hi){
            int currentsum = 0;
            int currentdays = 0;
            int mid = lo + (hi-lo)/2;
            for(int i=0;i<n;i++){
                if(currentsum + arr.get(i) <= mid){
                    currentsum += arr.get(i);
                }
                else {
                    currentdays++;
                    currentsum  = 0;
                    currentsum += arr.get(i);
                }
            }
            currentdays++;
            if(currentdays<=D){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}