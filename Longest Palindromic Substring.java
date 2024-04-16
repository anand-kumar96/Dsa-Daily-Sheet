
// method 01 : TC:O(N^3)
class Solution {
    public static boolean checkPalindrome(String str){
        int low = 0;
        int high = str.length()-1;
        while(low<high){
            if(str.charAt(low)!=str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(checkPalindrome(s.substring(i,j+1))){
                    if(ans.length()< s.substring(i,j+1).length()){
                        ans = s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
}

/// method 02 : TC:O(N^2)
class Solution {
     public String findLongestPalindrome(String s,int l, int h, int maxlen, String ans) {
         while(l>=0 && h<s.length() && s.charAt(l)== s.charAt(h)){
             String res = s.substring(l,h+1);
             if(res.length()>maxlen){
                 maxlen = res.length();
                 ans = res;
             }
             l--;
             h++;
         }
         return ans;
     }
    public String longestPalindrome(String s) {
      String ans = "";
      String res ="";
      int maxlen = 0;
      int l=0,h=0;
      int n = s.length();
    for(int i=0;i<n;i++){
        // for odd substring
        l =i;
        h=i;
        res = findLongestPalindrome(s,l,h,maxlen,ans);
        if(res.length()>maxlen){
        maxlen = res.length();
        ans = res;
         }
        // for even substring
        
        if(i<n-1) {
        l =i;
        h=i+1;
        res = findLongestPalindrome(s,l,h,maxlen,ans);
        if(res.length()>maxlen){
            maxlen = res.length();
            ans = res;
         }
        }
      }
        return ans;
    }
}
