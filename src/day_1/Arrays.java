package day_1;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        System.out.println(arr[0]);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            newArr[i] = sc.nextInt();
        }

        sc.close();
        Display(newArr);

        System.out.println("Printing Swap ============================");
        // swap 2 numbers
        swap(newArr, 0, 1);
        Display(newArr);
    }


    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}