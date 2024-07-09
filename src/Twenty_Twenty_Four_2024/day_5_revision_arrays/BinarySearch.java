package Twenty_Twenty_Four_2024.day_5_revision_arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 9;
        System.out.println(binarySearch(arr,key));
    }


    static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high)/2;
            if (key == arr[mid]) {
                return mid;
            }
            else if (key < arr[mid]) {
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
