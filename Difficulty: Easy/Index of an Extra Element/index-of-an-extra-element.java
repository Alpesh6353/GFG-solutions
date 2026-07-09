/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int n = b.length;
        if(n==1){
            if(a[0]==b[0]) return 1;
            else return 0;
        }
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(mid==0 && a[mid]!=b[mid]) return mid;
            else if(a[mid]!=b[mid] && a[mid-1]==b[mid-1]) return mid;
            else if(a[mid]==b[mid]) lo = mid+1;
            else hi = mid-1;
        }
        return n;
    }
}