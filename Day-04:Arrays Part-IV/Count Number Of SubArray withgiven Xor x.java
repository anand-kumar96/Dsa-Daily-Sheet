//https://www.codingninjas.com/codestudio/problems/count-subarrays-with-given-xor_1115652?leftPanelTab=1
// brute force approach
public class Solution {
public static int subarraysXor(ArrayList<Integer> arr, int x) {
	   int sum=0;
	   int n=arr.size();
	   int ans=0;
	   for(int i=0;i<n;i++){
		   sum=0;
		   for(int j=i;j<n;j++){
		       sum =sum^arr.get(j);
			   if(sum==x){
				   ans++;
			   }
	   }
	   }
	   return ans;
	}
}
