class Solution {
    public static int vowelCount(String s) {
        // code here
        int[] arr = new int[5];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') arr[0]++;
            else if(s.charAt(i)=='e') arr[1]++;
            else if(s.charAt(i)=='i') arr[2]++;
            else if(s.charAt(i)=='o') arr[3]++;
            else if(s.charAt(i)=='u') arr[4]++;
        }
        int count = 0;
        int selection = 1;
        for(int i=0;i<5;i++){
            if(arr[i]!=0){
                count++;
                selection *= arr[i];
            }
        }
        if(count==0) return 0;
        int arragements = 1;
        for(int i=1;i<=count;i++){
            arragements *= i;
        }
       return selection*arragements;
    }
}