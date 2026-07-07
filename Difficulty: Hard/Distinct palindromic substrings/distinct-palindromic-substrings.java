class Solution {
    public ArrayList<String> palindromicSubstr(String s) {
        // code here
        int n = s.length();
        ArrayList<String> a = new ArrayList<>();
        String ans = "";
        int j = 0;
        int k = 0;
        for(int i=0;i<n;i++){
            ans = s.substring(i,i+1);
            if(!(a.contains(ans))) a.add(ans);
            j=i-1;
            k=i+1;
            while(j>=0 && k<n){
                if(s.charAt(j)==s.charAt(k)){
                    ans = s.substring(j,k+1);
                    j--;
                    k++;
                    if(!(a.contains(ans))) a.add(ans);
                }
                else break;
            }
            ans = "";
        }
        for(int i=0;i<n;i++){
            j=i;
            k=i+1;
            while(j>=0 && k<n){
                if(s.charAt(j)==s.charAt(k)){
                    ans = s.substring(j,k+1);
                    j--;
                    k++;
                    if(!(a.contains(ans))) a.add(ans);
                }
                else break;
            }
            ans = "";
        }
        return a;
    }
}