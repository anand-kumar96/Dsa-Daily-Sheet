/// Decode String:https://leetcode.com/problems/decode-string/
class Solution {
    public String decodeString(String s) {
        Stack<String>stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        int k =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            // find number
            if (Character.isDigit(ch)) {
             k = (k * 10) + (ch - '0');
             continue;
             }
            
          // reset k =0 after adding num in stack
          if (ch == '[') {
            numStack.push(k);
            k = 0;
            stringStack.push(String.valueOf(ch));
            continue;
            }
            
            // if ch is alphabet
            if (ch != ']') {
            stringStack.push(String.valueOf(ch));
            continue;
            }
            
            // else by default ch =']'
            StringBuilder temp = new StringBuilder();
            while (!stringStack.peek().equals("[")) {
                  temp.insert(0, stringStack.pop());
            }
          
            // after that remove the "["
            stringStack.pop(); 
            
            // Get the new string
           StringBuilder replacement = new StringBuilder();
           int count = numStack.pop();
           for (int j = 0; j < count; j++){
           replacement.append(temp);
           }
           // Add it to the stack
           stringStack.push(replacement.toString());
        }
         StringBuilder ans = new StringBuilder();
        while(!stringStack.isEmpty()){
             ans.insert(0,stringStack.pop());
        }
        return ans.toString();
    }
}

//TC:O(N^2)

// brute force
class Solution {
    public String decodeString(String s) {
    //Brute force
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=']'){
                st.push(ch);
            }else {
                String ss = "";
                while(st.peek()-0 >=97 && st.peek()-0 <=122){
                    ss=st.pop()+ss;
                }
                st.pop();
                String val ="";
                while( !st.isEmpty() && st.peek()- 0 >=48 && st.peek()- 0 <=57){
                    val=st.pop()+val;
                }
               
                int num = Integer.parseInt(val);
                for(int j=0;j<num;j++){
                   for(int k=0;k<ss.length();k++){
                       st.push(ss.charAt(k));
                   }
                }
            }
        }
        
        String ans ="";
        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }
        return ans;
    }
}

//TC:O(N^3)
