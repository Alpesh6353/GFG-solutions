class Solution {
  public:
    // Function to convert the given string to Camel Case
    string convertToCamelCase(string& s) {
        // code here
        int n = s.length();
        string ans = "";
        int i = 0;
        bool flag = true;
        while(i<n){
            while(i<n && s[i] == ' ') i++;
            if(i>=n) break;
            while(i<n && s[i] != ' '){
                if(ans == "") ans += s[i];//if first character is letter than do not make it capital
                else if(flag==true) ans += (s[i]-32); // Making capital letter after every space
                else ans += s[i];
                i++;
                flag = false;
            }
            flag = true;
        }
        return ans;
    }
};
