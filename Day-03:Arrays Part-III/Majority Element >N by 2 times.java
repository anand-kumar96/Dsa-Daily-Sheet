//https://leetcode.com/problems/majority-element/
//Boyer-Moore Majority Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=nums[i];
                count=1;
            }else if(candidate==nums[i]){
                count++;
            }else{
                count--;
            }
        }
         count=0;
        for(int i=0;i<n;i++){
            if(candidate==nums[i]){
                count++;
            }
        }
        if(count>n/2){
            return candidate;
        }
        return -1;
    }
}
//method 01
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],(hm.get(nums[i])+1));
            }else{
                hm.put(nums[i],1);
            }
        }
        int ans=0;
        int index=0;
        for(Integer h:hm.keySet()){
        if(index<hm.get(h)){
            index=hm.get(h);
            ans=h;
        }
        }
        return ans;
    }
}

//method 02
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int count=1;
        int totalCount=1;
        int ans=0;
        int re=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                ans=nums[i];
                 count++;
                if(count>totalCount){
                totalCount=count;
                    re=ans;
                }
            }else{
            count=1;    
            }
        }
        return re;
    }
}
// method 03
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
