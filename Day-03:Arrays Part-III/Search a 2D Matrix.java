//method 01
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row=matrix.length;
       int col=matrix[0].length;
        int low=0;
        int high=(row*col)-1;
        int r=0;
        int c=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            r=mid/col;
            c=mid%col;
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}
//method 02
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int row=matrix.length;
          int col=matrix[0].length;
         int i=0;
         int j=col-1;
        while(i<row && j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
               j--;
            }else{
                i++;
            }
        }
        return false;
        
    }
}
