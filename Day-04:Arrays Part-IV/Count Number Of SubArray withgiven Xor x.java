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
// optimized
//T:O(n) S:O(n)

public class Solution {
public static int subarraysXor(ArrayList<Integer> arr, int x) {
	  int n=arr.size();
	  int xor[]=new int[n];
      xor[0]=arr.get(0);
	  for(int i=1;i<arr.size();i++){
		  xor[i]= xor[i-1]^arr.get(i);
	  }
	  HashMap<Integer,Integer>hm=new HashMap<>();
	  long ans=0;
	  for(int i=0;i<n;i++){
		  int temp=x^xor[i];
		  ans=ans+(hm.containsKey(temp)?(long)(hm.get(temp)):0);
		  if(xor[i]==x){
			  ans++;
		  }
		  if(hm.containsKey(xor[i])){
			  hm.put(xor[i],hm.get(xor[i])+1);
		  }else{
			    hm.put(xor[i],1);
		  }
	  }
	  return (int)ans;
	  
	}
}
