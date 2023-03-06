//https://leetcode.com/problems/set-matrix-zeroes/
//method 01
class Solution {
    public static void modifyMatrix(int matrix[][],int a,int b){
       int row=matrix.length;
       int col=matrix[0].length;
        for(int i=0;i<col;i++){
            matrix[a][i]=0;
        }
        for(int i=0;i<row;i++){
            matrix[i][b]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
       int row=matrix.length;
       int col=matrix[0].length;
        int arr[][]=new int[row][col];
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if(matrix[i][j]==0){
                   arr[i][j]=1;
               }
           }
       }
         for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if( arr[i][j]==1){
                 modifyMatrix(matrix,i,j); 
               }
           }
       }
    }
}
//method 02
class Solution {
    public void setZeroes(int[][] matrix) {
       int row=matrix.length;
       int col=matrix[0].length;
        int R[]=new int[row];
        int C[]=new int[col];
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if(matrix[i][j]==0){
                   R[i]=1;
                   C[j]=1;
               }
           }
       }
         for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if(R[i]==1 || C[j]==1){
                matrix[i][j]=0;
               }
           }
       }
    }
}
//for above both
// Time Complexity: O(M*N), Traversing over the matrix two times.
// Auxiliary Space: O(M + N), Taking two arrays one of size M and another of size N.

// method 03
class Solution {
    public void setZeroes(int[][] matrix) {
       int row=matrix.length;
       int col=matrix[0].length;
        boolean colVal=false;
       for(int i=0;i<row;i++){
           if(matrix[i][0]==0){
                  colVal=true;
              }
           for(int j=1;j<col;j++){
               if(matrix[i][j]==0){
                   matrix[i][0]=matrix[0][j]=0;
               }
           }
       }
         for(int i=row-1;i>=0;i--){
           for(int j=col-1;j>=1;j--){
              if(matrix[i][0]==0 || matrix[0][j]==0) {
                  matrix[i][j]=0;
              }
           }
              if(colVal==true) {
               matrix[i][0]=0;
               }
       }
    }
}
// Time Complexity: O(M*N), Traversing over the matrix two times.
// Auxiliary Space: O(1)
