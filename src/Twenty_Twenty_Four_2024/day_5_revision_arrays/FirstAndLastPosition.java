package Twenty_Twenty_Four_2024.day_5_revision_arrays;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 7, 8, 9};
        int[] search = binarySearch(arr, 4);

        System.out.println(Arrays.toString(binarySearch(arr, 4)));

        for (int s : search) {
            System.out.print("\n" + s);
        }
    }

    static int[] binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int res[] = {-1, -1};

        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                res[0] = mid;
                high = mid - 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = arr.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                res[1] = mid;
                low = mid + 1;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }
}
