package day_5;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, -5, 8, -8, -9, 6, 2, 3, 4, 1, 5, 8, 9};
        int[] insertionSort = insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(insertionSort[i] + " ");
        }
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int picked_item = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > picked_item) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = picked_item;
        }
        return arr;
    }
}
