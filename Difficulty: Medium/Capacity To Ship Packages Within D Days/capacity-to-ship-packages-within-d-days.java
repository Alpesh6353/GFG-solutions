class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int D) {
        // code here
        int n = arr.size();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(arr.get(i)>max) max = arr.get(i);
            sum += arr.get(i);
        }
        int lo=max;
        int hi = sum;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int count = 0;
             int sum2 = 0;
            for(int i=0;i<n;i++){
                sum2 += arr.get(i);
                if(sum2==mid){
                    count++;
                    sum2 = 0;
                }
                else if(sum2>mid){
                    count++;
                    i--;
                    sum2 = 0;
                }
            }
            if(sum2 != 0){
                if(mid>sum2) count++;
            }
            if(count<=D){
                ans = mid;
                hi = mid-1;
            }
            else if(count>D) lo = mid+1;
            else hi = mid-1;
        }
        return ans;
    }
}