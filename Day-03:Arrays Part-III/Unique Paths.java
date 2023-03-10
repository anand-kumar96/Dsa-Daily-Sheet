//https://leetcode.com/problems/unique-paths/
class Solution {
    public int uniquePaths(int m, int n) {
    if(m==1 && n==1){
        return 1;
    }
        int path[][]=new int[m][n];
        //row path
        for(int i=0;i<m;i++){
            path[i][0]=1;
        }
        //col path
        for(int i=0;i<n;i++){
            path[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                path[i][j]=path[i-1][j]+path[i][j-1];
            }
        }
        return path[m-1][n-1];
    }
}
//method 02
class Solution {
    public int uniquePaths(int m, int n) {
        // total box cover to go finish line in any way
        int total=m+n-2;
        int k=m-1;//number of way to go down
        // different way is =sck
        //try to find k minimum since sck=scs-k
        if((total-k)<k){
            k=total-k;
        }
        long ans=1;
        for(int i=0;i<k;i++){
            ans *=(total-i);
            ans /=(i+1);
        }
        return (int)ans;
    }
}
