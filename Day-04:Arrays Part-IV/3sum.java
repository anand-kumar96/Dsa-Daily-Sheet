//https://leetcode.com/problems/3sum/submissions/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //1=>sort array
        Arrays.sort(nums);
        //2> find target ignoring duplicate
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int low=i+1;
                int high=n-1;
                int sum=-nums[i];
                while(low<high){
                    if(nums[low]+nums[high]==sum){
                       ans.add(Arrays.asList(nums[i],nums[low],nums[high])); 
                        while(low<high && nums[low]==nums[low+1]) low++;
                         while(low<high && nums[high]==nums[high-1]) high--;
                        low++;
                        high--;
                    }else if(nums[low]+nums[high]>sum){
                        high--;
                    }else{
                        low++;
                    }
                }
            }
        }
        return ans;
    }
}
