package day_8;

public class TwoD_Array {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4, 56, 5, 58, 8, 9, 8},
                {3, 4, 56, 5, 58, 8, 9}
        };

       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[i].length; j++) {
               System.out.print(arr[i][j] + " ");
           }
       }
    }

}
