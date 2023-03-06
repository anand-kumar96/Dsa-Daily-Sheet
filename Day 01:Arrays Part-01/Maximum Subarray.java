/*
The idea of Kadane’s algorithm is to maintain a variable max_ending_here that stores the maximum sum contiguous subarray ending
at current index and a variable max_so_far stores the maximum sum of contiguous subarray found so far,
Everytime there is a positive-sum value in max_ending_here compare it with max_so_far and update max_so_far if it is greater than max_so_far.

So the main Intuition behind Kadane’s algorithm is, 
– the subarray with negative sum is discarded (by assigning max_ending_here = 0 in code).
– we carry subarray till it gives positive sum.
*/
//https://leetcode.com/problems/maximum-subarray/submissions/
class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending=0;
        for(int i=0;i<nums.length;i++){
            max_ending +=nums[i];
            max_so_far=Math.max(max_so_far,max_ending);
            if(max_ending<0){
                max_ending=0;
            }
        }
        return max_so_far;
    }
}
