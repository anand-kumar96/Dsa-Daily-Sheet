//https://leetcode.com/problems/merge-intervals/
class Solution {
    public int[][] merge(int[][] intervals) {
        //sort this interval
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]>list=new ArrayList<>();
        //iterate
        for(int interval[]:intervals){
            if(list.size()==0){
                list.add(interval);
            }else{
                //check condition
                int preInterval[]=list.get(list.size()-1);
                if(preInterval[1]>=interval[0]){
                    preInterval[1]=Math.max(preInterval[1],interval[1]);
                }else{
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
