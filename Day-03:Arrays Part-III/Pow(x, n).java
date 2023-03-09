//https://leetcode.com/problems/powx-n/
class Solution {
    public double myPow(double x, int n) {
        return (double)Math.pow(x, n);
    }
}
//method 2
class Solution {
    public double myPow(double x, int n) {
     double ans=1.0;
        long nn=n;
        if(nn<0){
            nn=nn*-1;
        }
        while(nn>0){
            if(nn%2==1){
                ans *=x;
                nn=nn-1;
            }else{
                x *=x;
                nn=nn/2;
            }
        }
        if(n<0){
            ans=1.0/ans;
        }
        return ans;
    }
}
