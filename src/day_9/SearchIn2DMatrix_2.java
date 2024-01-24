package day_9;

//https://leetcode.com/problems/search-a-2d-matrix-ii/
public class SearchIn2DMatrix_2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >=0) {
            if(matrix[row][col] == target) {
                return true;
            } else if(matrix[row][col] > target) {
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}


