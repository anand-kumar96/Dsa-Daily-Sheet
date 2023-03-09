//https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution{
    public static long merge(long arr[],long temp[],int low,int mid,int high){
        int i=low,j=mid,k=low;
        long count=0;
        while(i<mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                count +=mid-i;
            }
            
        }
        while(i<mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
             temp[k++]=arr[j++];
        }
        for( i=low;i<=high;i++){
            arr[i]=temp[i];
        }
        return count;
    }
    public static long mergeSort(long arr[],long temp[],int low,int high){
        long count=0;
        if(low<high){
            int mid=low+(high-low)/2;
             count =mergeSort(arr,temp,low,mid);
             count +=mergeSort(arr,temp,mid+1,high);
             count +=merge(arr,temp,low,mid+1,high);
        }
         return count;
    }
    static long inversionCount(long arr[], long N) {
     long temp[]=new long[(int)N];
     long ans=  mergeSort(arr,temp,0,(int)N-1);
     return ans;
    }
}
