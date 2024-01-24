package day_9;

public class PrintWave {

    public static void main(String[] args) {

        int arr[][] = {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}
        };
        printWave(arr);
    }

    public static void printWave(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            if ( i % 2 == 0){
                for (int j = 0; j< arr[0].length;j++) {
                    System.out.print(arr[i][j] +" ");
                }
            }else{
                for (int j = arr.length-1; j >= 0; j--) {
                    System.out.print(arr[i][j] +" ");
                }
            }
            System.out.println();
        }
    }
}
