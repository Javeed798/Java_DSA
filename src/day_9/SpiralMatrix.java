package day_9;

public class SpiralMatrix {
    public static void main(String[] args) {

        int arr[][] = {
                {1,2,3,4,5,6},
                {5,4,2,6,9,8},
                {8,9,55,66,22,33},
                {11,2,3,4,51,61},
                {1,2,3,4,5,6}
        };
        spiralMatrix(arr);
    }

    public static  void spiralMatrix(int[][] arr) {
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length-1;
        int maxCol = arr[0].length-1;

        int count = 0;
        int totalElements = arr.length * arr[0].length;

       while (count < totalElements){
           for (int i = minCol; i < maxCol && count < totalElements; i++) {
               System.out.print(arr[minRow][i] + " ");
               count++;
           }
           minRow++;

           for (int i= minRow; i< maxRow && count < totalElements; i++) {
               System.out.print(arr[i][maxCol] + " ");
               count++;
           }
           maxCol--;

           for (int i = maxCol; i>= minCol && count < totalElements;i--){
               System.out.print(arr[maxRow][i] + " ");
               count++;
           }
           maxRow--;

           for (int i= maxRow; i>= minRow && count < totalElements; i--) {
               System.out.print(arr[i][minCol] + " ");
               count++;
           }
           maxCol++;
       }
    }

}
