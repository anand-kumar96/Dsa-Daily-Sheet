//https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        long sum=(n*(n+1))/2;
        long ActualSum=0;
        for(int i=0;i<n;i++){
            ActualSum +=nums[i];
        }
        return (int)(sum-ActualSum);
    }
}
