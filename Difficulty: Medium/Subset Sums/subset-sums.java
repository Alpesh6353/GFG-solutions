class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        sum(arr,res,ans,0);
        return res;
    }
    public void sum(int[] arr,ArrayList<Integer> res,ArrayList<Integer> ans,int idx){
        if(idx==arr.length){
            int sum = 0;
            for(int i=0;i<ans.size();i++){
                sum += ans.get(i);
            }
            res.add(sum);
            return;
        }
        int x = arr[idx];
        ans.add(x);
        sum(arr,res,ans,idx+1);
        // Remove the number to reset your list (backtrack)
        ans.remove(ans.size()-1);
        sum(arr,res,ans,idx+1);
    }
}