package Twenty_Twenty_Four_2024.day_6_revison_arrays;

public class CountOfEqualAndSmallerElements {

    public static void main(String[] args) {
        int arr[] = {1,2,3,55,66,77,88,88,88,99};
        System.out.println(countOfEqAndSmallerElements(arr,88));
    }

    public static int countOfEqAndSmallerElements(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {

                while (arr[mid + 1] == key && mid + 1 < arr.length) {
                    mid++;
                }
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (key > arr[mid]) {
            return mid;
        } else {
            return mid + 1;
        }
    }
}
