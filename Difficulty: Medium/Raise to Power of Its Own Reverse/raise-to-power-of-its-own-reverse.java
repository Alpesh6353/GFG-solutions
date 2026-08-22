class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev = reverse(n,0);
        return power(n,rev);
    }
    public int reverse(int n,int r){
        if(n==0) return r;
        return reverse(n/10,r*10+n%10);
    }
    public int power(int a,int b){
        if(b==0) return 1;
        int call = power(a,b/2);
        if(b%2==0) return call*call;
        else return call*call*a;
    }
}
