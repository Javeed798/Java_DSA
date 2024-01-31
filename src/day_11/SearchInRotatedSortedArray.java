package day_11;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target =46 ;
        System.out.println(search(arr,target));
    }

    public static int search(int arr[], int target) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == arr[mid]) {
                return mid;

                // if its left sorted portion of not
            } else if (arr[low] < arr[mid]) {

                if (target >= arr[low] && target < arr[mid]) {
                    high = mid-1;
                } else {
                    low = mid + 1;
                }
            }

            else {
                if (target <= arr[low] && target > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid -1;
                }
            }

        }
        return -1;
    }
}
