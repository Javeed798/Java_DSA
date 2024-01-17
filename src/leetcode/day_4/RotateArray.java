package leetcode.day_4;

import day_4.ArrayReverseWithRange;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 , 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
//        int[] arrayBruteForce = rotateArrayBruteForce(arr, n);
        int[] arrayOptimised = rotateArrayOptimises(arr, n);
        for (int i = 0; i < arrayOptimised.length; i++) {
            System.out.print(arrayOptimised[i] + " ");
        }
    }

    public static int[] rotateArrayBruteForce(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        for (int i = 1; i <= k; i++) {
            int last_elem = arr[n-1];
            for (int j = n-2; j>=0; j--) {
                arr[j+1] = arr[j];
            }
            arr[0] = last_elem;
        }
        return arr;
    }

    public static int[] rotateArrayOptimises(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        ArrayReverseWithRange.reverseWithRange(arr,0,n-k-1);
        ArrayReverseWithRange.reverseWithRange(arr,n-k,n-1);
        ArrayReverseWithRange.reverseWithRange(arr,0,n-1);
        return arr;
    }
}
