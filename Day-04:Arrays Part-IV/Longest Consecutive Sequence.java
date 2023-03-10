//https://leetcode.com/problems/longest-consecutive-sequence/
//optimal method T: O(n)  S:O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(!hs.contains(nums[i]-1)){
                int j=nums[i];
                while(hs.contains(j)){
                    hs.remove(Integer.valueOf(j));
                    j++;
                }
                ans=Math.max(ans,j-nums[i]);
            }
        }
        return ans;
        
    }
}
//brute force
class Solution {
    public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
        int max=1;
        int currentMax=0;
        int i=0;
        int j=1;
        int n=nums.length;
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        while(j<n){
            if(nums[j]-nums[j-1]==0){
                j++;
                i++;
            } else if(nums[j]-nums[j-1]==1){
                 currentMax=j-i+1;
                 max=Math.max(max,currentMax);
                 j++;
            }else{
                currentMax=0;
                i=j;
                j++;
            }
        }
        return max;
    }
}
//
class Solution {
    public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
        int n=nums.length;
        if(n==0){
            return 0;
        }
        // store unique element
     ArrayList<Integer>li=new ArrayList<>();
        li.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                li.add(nums[i]);
            }
        }
        int count=1;
        int max=0;
        for(int i=0;i<li.size();i++){
            if(i==0){
                count=1;
            }else if(i>0 && li.get(i)-li.get(i-1)==1){
                count++;
            }else{
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}

