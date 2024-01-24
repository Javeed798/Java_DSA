package day_9;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {3,2,3,5},
                {0,2,9,7},
                {12,25,35,4}
        };

        int[][] transpose = transpose(arr);
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1 ; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
}
