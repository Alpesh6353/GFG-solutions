class Solution {
    public int power(int n,int p){
        if(p==0) return 1;
        if(p==1) return n;
        int left = power(n,p/2);
        if(p%2==0) return left*left;
        else return left*left*n;
    }
    public int recursivePower(int n, int p) {
        // code here
        return power(n,p);
    }
}
