//https://leetcode.com/problems/reverse-pairs/
class Solution { 
    public static int merge(int arr[],int low, int mid,int high){
        int count=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && arr[i]>2*(long)arr[j]){
                j++;
            }
            count +=j-(mid+1);
        }
        ArrayList<Integer>li=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                li.add(arr[left++]);
            }else{
                li.add(arr[right++]);
            }
        }
        while(left<=mid){
            li.add(arr[left++]);
        }
        while(right<=high){
            li.add(arr[right++]);
        }
          for(int i=0;i<li.size();i++){
            arr[low+i]=li.get(i);
        }
        return count;
    }
    public static int mergeSort(int arr[],int low, int high){
        int count=0;
        if(low<high){
            int mid=low+(high-low)/2;
            count = mergeSort(arr,low,mid);
            count +=mergeSort(arr,mid+1,high);
            count +=merge(arr,low,mid,high);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}
