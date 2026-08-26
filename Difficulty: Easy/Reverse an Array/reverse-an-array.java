class Solution {
    public void reverseArray(int arr[]) {
        // code here
        reverse(arr,0,arr.length-1);
    }
    public void reverse(int[] arr,int i,int j){
        if(i>j) return ;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr,i+1,j-1);
    }
}