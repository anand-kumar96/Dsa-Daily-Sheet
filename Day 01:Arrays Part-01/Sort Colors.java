//https://leetcode.com/problems/sort-colors/
//method 01
class Solution {
    public void sortColors(int[] nums) {
       int n=nums.length;
        int Zero=0,One=0,Two=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                Zero++;
            }else if(nums[i]==1){
                One++;
            }else {
                Two++;
            }
        }
        for(int i=0;i<Zero;i++){
            nums[i]=0;
        }
        for(int i=Zero;i<Zero+One;i++){
            nums[i]=1;
        }
        for(int i=Zero+One;i<n;i++){
            nums[i]=2;
        }
        
    }
}
// Time complexity:O(N)
// Space complexity:O(N)

//method 02
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp;
        while(mid<=high){
            switch(nums[mid]){
                case 0: temp=nums[mid];
                    nums[mid]=nums[low];
                    nums[low]=temp;
                    low++;
                    mid++;
                    break;
                case 1: mid++;
                    break;
                    
                case 2:temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                    break;
            }
        }
        
    }
}
// Time complexity:O(N)
// Space complexity:O(1)
