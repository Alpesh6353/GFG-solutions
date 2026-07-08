class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int n = s.length();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int maxcount = 0;
        int count = 1;
        int k = -1;
        for(int i=1;i<n;i++){
            if(ch[i]==ch[i-1]) count++;
            else if(maxcount<count){
                    maxcount = count;
                    k = i-1;
                    count = 1;
                }
            else count = 1;
        }
        if(maxcount<count){
                    maxcount = count;
                    k = n-1;
                }
        if(k==-1) return ch[0];
        else return ch[k];
    }
}