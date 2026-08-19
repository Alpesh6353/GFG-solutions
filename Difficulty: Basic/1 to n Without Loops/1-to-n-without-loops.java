class Solution {
    public void print(int n){
        if(n==0) return ;
        print(n-1);
        System.out.print(n+" ");
    }
    public void printTillN(int n) {
        // code here
        print(n);
    }
}