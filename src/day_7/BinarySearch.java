package day_7;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8 ,45};
        System.out.println(binarySearch(arr,8));
    }

    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] == key) {
                return  mid;
            } else if(arr[mid] < key) {
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
