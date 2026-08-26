class Solution {
    public ArrayList<String> powerSet(String s) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        set(res,s,"",0);
        return res;
        
    }
    public void set(ArrayList<String> res,String s,String ans,int idx){
        if(s.length()==idx){
            res.add(ans);
            return ;
        }
        char ch = s.charAt(idx);
        set(res,s,ans+ch,idx+1); // pick
        set(res,s,ans,idx+1);  // not pick
    }
}
