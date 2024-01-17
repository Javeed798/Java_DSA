package day_4;

public class ArrayReverse {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 , 5, 6, 7, 8, 9};
        int[] reverse = reverse(arr);
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]+ " ");
        }

    }

    public static int[] reverse(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
