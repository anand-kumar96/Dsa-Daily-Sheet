//https://leetcode.com/problems/majority-element-ii/
// to find majority element use boyer-moore-majority-voting-algorithm=> https://www.geeksforgeeks.org/boyer-moore-majority-voting-algorithm/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        for(Integer h:hm.keySet()){
            if(hm.get(h)>(n/3)){
                ans.add(h);
            }
        }
        return ans;
    }
}

//method 02
//boyer-moore-majority-voting-algorithm
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1=-1;
        int candidate2=-2;
        int count1=0;
        int count2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
              if(candidate1==nums[i]){
                count1++;
            }else if(candidate2==nums[i]){
                count2++;
            }else if(count1==0){
                candidate1=nums[i];
                 count1=1;
            }else if(count2==0){
                candidate2=nums[i];
                 count2=1;
             }else {
                count1--;
                count2--;
              }
            }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
           if(candidate1==nums[i]){
               count1++;
           }  if(candidate2==nums[i]){
               count2++;
           }
        }
        ArrayList<Integer>list=new ArrayList<>();
        if(count1>n/3) list.add(candidate1);
        if(count2>n/3) list.add(candidate2);
        return list;
    }
}
