//https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>>ans=new ArrayList<List<Integer>>();
         ArrayList<Integer>first=new ArrayList<>();
        first.add(1);
        ans.add(first);
        if(numRows==1){
            return ans;
        }
        ArrayList<Integer>second1=new ArrayList<Integer>();
        second1.add(1);
        second1.add(1);
        ans.add(second1);
        for(int i=2;i<numRows;i++){
            ArrayList<Integer>second2=new ArrayList<Integer>();
            second2.add(1);
            List<Integer>find=ans.get(i-1);
            int p1=0;
            int p2=1;
            while(find.size()>p2){
                int sum=find.get(p1)+find.get(p2);
                second2.add(sum); 
                p1++;
                p2++;
            }
             second2.add(1);
            ans.add(second2);
        }
        return ans;
    }
}
