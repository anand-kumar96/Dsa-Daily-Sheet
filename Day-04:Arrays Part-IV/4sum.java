// https://leetcode.com/problems/4sum/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>ans1=new ArrayList<>();
        HashSet<List<Integer>>ans=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int low=j+1;
                int high=n-1;
                while(low<high){
                    long sum=nums[i]+nums[j]+(long)nums[low]+nums[high];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        low++;
                        high--;
                    }else if(sum>target){
                        high--;
                    }else{
                        low++;
                    }
                }
            }
        }
        for(List<Integer>li:ans){
            ans1.add(li);
        }
        return ans1;
    }
}
//method 02
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>>ans=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int low=j+1;
                int high=n-1;
                while(low<high){
                    long sum=nums[i]+nums[j]+(long)nums[low]+nums[high];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        low++;
                        high--;
                    }else if(sum>target){
                        high--;
                    }else{
                        low++;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
