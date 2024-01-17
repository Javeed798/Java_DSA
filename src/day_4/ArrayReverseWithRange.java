package day_4;

public class ArrayReverseWithRange {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 , 5, 6, 7, 8, 9};
        int[] reverse = reverseWithRange(arr,2,6);
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]+ " ");
        }
    }

    public static int[] reverseWithRange(int[] arr, int start, int end) {
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
