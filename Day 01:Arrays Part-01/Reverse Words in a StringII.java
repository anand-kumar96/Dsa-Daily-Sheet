//https://www.lintcode.com/problem/3648/
public class Solution {
     public static void reverseList(List<Character>s,int low,int high){
     while(low<=high){
         char ch = s.get(low);
         s.set(low, s.get(high));
         s.set(high,ch);
         low++;
         high--;
     }
     }
    public void reverseWords(List<Character> s) {
      // reverse whole list
      reverseList(s,0,s.size()-1);
      // reverse each word
      int low =0;
      int high=0;
      for(int i=0;i<s.size();i++){
          if(s.get(i)!=' ') {
            high=i;
          }else {
           reverseList(s,low,high);
           low = i+1;
          }
      }
      reverseList(s,low,high);
    }
}

// or
public class Solution {
     public static void reverseList(List<Character>s,int low,int high){
     while(low<=high){
         char ch = s.get(low);
         s.set(low, s.get(high));
         s.set(high,ch);
         low++;
         high--;
     }
     }
    public void reverseWords(List<Character> s) {
      // reverse whole list
      reverseList(s,0,s.size()-1);
      // reverse each word
      int low = 0;
      for(int r=0;r<s.size();r++){
          if(s.get(r)==' ') {
           reverseList(s,low,r-1);
           low = r+1;
          }
      }
      reverseList(s,low,s.size()-1);
    }
}
