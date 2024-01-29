package day_10;

public class CountOfSmallerAndEqualNoDups {

    public static int countOfSmallerAndEqual(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid + 1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,8,9,10,11,12};
        System.out.println(countOfSmallerAndEqual(arr,10));
    }
}
