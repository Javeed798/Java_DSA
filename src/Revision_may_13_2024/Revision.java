package Revision_may_13_2024;

import java.util.Scanner;

public class Revision {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];
    for(int i = 0; i < n;i++) {
      arr[i] = sc.nextInt();
    }

    int[] bubbleSort = bubbleSort(arr);
    for (int j : bubbleSort) {
      System.out.print(j + " ");
    }
    
  }

  public static int[] bubbleSort(int arr[]) {
    for (int turn = 1; turn < arr.length; turn++) {
      for(int i = 0; i < arr.length - turn; i++) {
        if(arr[i] > arr[i+1]) {
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
    }
    return arr;
  }
}
