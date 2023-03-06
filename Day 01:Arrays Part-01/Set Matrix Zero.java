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
        System.out.println(row+" "+col);
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
