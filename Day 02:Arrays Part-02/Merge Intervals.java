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
//method 2
class Solution {
    public int[][] merge(int[][] intervals) {
        //sort this interval
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]>list=new ArrayList<>();
       int low=intervals[0][0];
      int high=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(high>=intervals[i][0]){
                if(high<intervals[i][1])
                    high=intervals[i][1];
                }else{
                    list.add(new int[]{low,high});
                    low=intervals[i][0];
                    high=intervals[i][1];
                }
            }
        list.add(new int[]{low,high});
        return list.toArray(new int[list.size()][2]);
    }
}
