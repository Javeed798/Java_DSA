package Twenty_Twenty_Four_2024.day_5_revision_arrays;

public class AllocateBooks {

    public static void main(String[] args) {

        int arr[] = {12, 34, 67, 90};
        int b = 2;

        System.out.println(maxPages(arr, 2));


    }

    static boolean isPossible(int arr[], int mid, int b) {
        int students = 1;
        int spc = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > mid) {
                return false;
            }

            if (spc + arr[i] <= mid) {
                spc += arr[i];
            } else {
                students++;
                if (students > b) {
                    return false;
                }
                spc = arr[i];
            }
        }
        return true;
    }

    static int maxPages(int arr[], int b) {
        if (b > arr.length) {
            return -1;
        }

        int low = arr[0]; // we dont know whether the array will be sorted or not so we will calculate that
        int high = 0; // its the total sum of the array

        // i.e our answer will life from the smallest value of our array to the total sum of the array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < low) {
                low = arr[i];
            }
            high = high + arr[i];
        }

        int res = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isPossible(arr, mid, b)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return res;
    }
}




























