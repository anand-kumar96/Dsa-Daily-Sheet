//https://leetcode.com/problems/merge-sorted-array/
//with space
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int result[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[k++]=nums1[i++];
            }else{
                result[k++]=nums2[j++];
            }
        }
        while(i<m){
             result[k++]=nums1[i++];
        }
        while(j<n){
            result[k++]=nums2[j++];
        }
        for( i=0;i<m+n;i++){
            nums1[i]=result[i];
        }
    }
}

//without space
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     //without space
        int first=m-1;
        int second=n-1;
        int index=m+n-1;
        while(first>=0 && second>=0){
            if(nums1[first]>nums2[second]){
                nums1[index--]=nums1[first--];
            }else{
                nums1[index--]=nums2[second--];
            }
        }
        while(first>=0){
             nums1[index--]=nums1[first--];
            
        }
         while(second>=0){
              nums1[index--]=nums2[second--];
         }
    }
}
