package day_3;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(search(arr,4));
    }


    public static int search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
