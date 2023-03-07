//https://leetcode.com/problems/next-permutation/
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
          int index1=-1,index2=-1;
         //find the index of the first number that is lesser than it's next
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                 index1=i-1;
                break;
            }
        }
//if such a number exists,for a lexicographical order,find the number immediately bigger than it
        if(index1!=-1){
        for(int i=n-1;i>=index1;i--){
            if(nums[i]>nums[index1]){
                  index2=i;
                break;
            }
        }
        //perform a swap of the two numbers
            int temp=nums[index1];
            nums[index1]=nums[index2];
            nums[index2]=temp;
        }
         //reverse the order after the break point(ind1) to ensure the lexicographical order
        for(int i=index1+1,j=n-1;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
