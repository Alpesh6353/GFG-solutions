class Solution {
    public  int series(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        return series(n-2)*series(n-2) - series(n-1);
    }
    public ArrayList<Integer> gfSeries(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = series(i);
            ans.add(x);
        }
        return ans;
    }
}