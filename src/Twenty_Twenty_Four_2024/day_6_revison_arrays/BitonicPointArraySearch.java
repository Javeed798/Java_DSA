package Twenty_Twenty_Four_2024.day_6_revison_arrays;

public class BitonicPointArraySearch {
    public static void main(String[] args) {
        int[] arr = {2, 9, 10, 20, 17, 5, 1};
        int b = bitonicPoint(arr);

        System.out.println(bitonicSearch(arr, 10, b));

    }

    public static int ascendingBinarySearch(int arr[], int key, int range) {
        int low = 0;
        int high = range;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int descendingBinary(int arr[], int key, int range) {
        int low = range;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int bitonicPoint(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return -1;
    }

    public static int bitonicSearch(int arr[], int key, int bitonicIndex) {
        if (arr[bitonicIndex] == key) {
            return bitonicIndex;
        }

        if (key > arr[bitonicIndex]) {
            return -1;
        }

        int res1 = ascendingBinarySearch(arr, key, bitonicIndex - 1);
        if (res1 != -1) {
            return res1;
        }

        int res2 = descendingBinary(arr, key, bitonicIndex + 1);
        if (res2 != -1) {
            return res2;
        }

        return -1;
    }


}
