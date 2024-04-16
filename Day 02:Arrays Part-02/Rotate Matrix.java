
//https://leetcode.com/problems/rotate-image/submissions/
class Solution {
    public void rotate(int[][] matrix) {
      int n=matrix[0].length;
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){
                //store top value
                int temp=matrix[i][j];
                //left to top
               matrix[i][j]=matrix[n-1-j][i];
                //bottom to left
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                //right to bottom
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                //top to right
                matrix[j][n-1-i]=temp;
                
            }
        }
    }
}


/// Solution: 02
class Solution {
    public static void reverseRow(int matrix[][],int i, int low, int high) {
        while(low<high){
            int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high]= temp;
            low++;
            high--;
        }
    }
    public void rotate(int[][] matrix) {
      int n = matrix.length;
     //1 do transpose
     for(int i=0;i<n;i++) {
     for(int j=i+1;j<n;j++){
        int temp = matrix[i][j];
         matrix[i][j]= matrix[j][i];
         matrix[j][i]=temp;
     }
     }
     //2 then reverse each row
        for(int i=0;i<n;i++){
          reverseRow(matrix,i,0,n-1);
        }
    }
}

/*
top=(i,j)
right=(i,n-1-j)
bottom=(n-1-i,n-1-j);
left=(n-1-i,j)
//anticlockWise
so just swap i and j except in bottom
  temp=(i,j)
 left to top=>top(i,j)=(n-1-j,i)
 bottom to left(n-j-1,i)=(n-1-i,n-1-j)
 right to bottom(n-1-i,n-1-j)=(j,n-1-i)
 top to right=(j,n-1-i)=temp
 
 //for clockwise same approach
*/
