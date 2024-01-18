package day_5;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = {5, -5, 8, -8, -9, 6, 2, 3, 4, 1, 5, 8, 9};
        int[] selectionSort = selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(selectionSort[i] + " ");
        }
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    }
}
