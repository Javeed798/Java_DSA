package day_4;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] bubbleSort = bubbleSort(arr);
        for (int i = 0; i < bubbleSort.length; i++) {
            System.out.print(bubbleSort[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length - turn; i++) {
                if (arr[i] > arr[i+1]) {   // just interchange > or < here to get ascending or descending sort
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
