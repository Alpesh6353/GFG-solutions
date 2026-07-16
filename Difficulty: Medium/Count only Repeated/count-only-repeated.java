class Solution {
    public ArrayList<Integer> findRepeating(int[] arr) {
        // code here
          int n = arr.length;
          ArrayList<Integer> ans = new ArrayList<>();
          if(n==1){
              ans.add(-1);
              ans.add(-1);
              return ans;
          }
          int lo = 0;
          int hi = n-1;
          int a = -1;
          while(lo<=hi){
              int mid = lo + (hi-lo)/2;
              if(mid==0){
                  if(arr[mid]==arr[mid+1]){
                  a = mid;
                  lo = mid+1;
                  }
                  else break;
              }
              else if(mid==n-1){
                  if(arr[mid]==arr[mid-1]){
                  a = mid-1;
                  hi = mid-1;
                  }
                  else break;
              }
              else if(arr[mid]==arr[mid-1]){
                  a = mid-1;
                  hi = mid-1;
              }
              else if(arr[mid]==arr[mid+1]){
                  a = mid;
                  lo = mid+1;
              }
              else if((arr[mid]-mid) == (arr[lo]-lo)){
                  if(mid==lo) hi = mid-1;
                  else lo = mid+1;
                  
              }
              else hi = mid-1;
          }
          if(a==-1){
              ans.add(-1);
              ans.add(-1);
              return ans;
          }
          ans.add(arr[a]);
          lo = 0;
          hi = n-1;
          while(lo<=hi){
              int mid = lo + (hi-lo)/2;
              if(arr[mid]==arr[a]) lo  = mid+1;
              else if(arr[mid]>arr[a]) hi = mid-1;
              else lo=mid+1;
          }
          a = hi-a+1;
          ans.add(a);
          return ans;
    }
}
