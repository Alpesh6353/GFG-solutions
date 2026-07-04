class Solution {
  public:
    // Function to convert the given string to Camel Case
    string convertToCamelCase(string& s) {
        // code here
        int n = s.length();
        string ans = "";
        string a = "";
        int i = 0;
        bool flag1 = false;
        if(s[0]==' '){
            flag1 = true;
        }
        bool flag = true;
        while(i<n){
            while(i<n && s[i] == ' ') i++;
            if(i>=n) break;
            while(i<n && s[i] != ' '){
                if(flag1==false) a += s[i];
                else if(flag==true) a += (s[i]-32);
                else a += s[i];
                i++;
                flag = false;
            }
            flag = true;
            flag1 = true;
            ans += a;
            a = "";
        }
        return ans;
    }
};
