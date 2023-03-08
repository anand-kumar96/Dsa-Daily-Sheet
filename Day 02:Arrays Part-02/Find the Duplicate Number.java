//https://leetcode.com/problems/find-the-duplicate-number/
// using binary search important Question
//method 01
class Solution {
    public int findDuplicate(int[] nums) {
     Arrays.sort(nums);
        int ans=0;
      for(int i=1;i<nums.length;i++){
          if(nums[i]==nums[i-1]){
              ans=nums[i];
              break;
              
          }
      }
        return ans;
    }
}
// constant space
class Solution {
    public int findDuplicate(int[] nums) {
    int arr[]=new int[100001];
     int ans=0;
      for(int i=0;i<nums.length;i++){
          if(arr[nums[i]]==0){
              arr[nums[i]]=nums[i];
          }else {
             ans=arr[nums[i]];
             break;
          }
      }
        return ans;
    }
}
// method 03
class Solution {
    public int findDuplicate(int[] nums) {
    int low=1;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid){
                    count++;
                }
            }
            if(count<=mid){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}
