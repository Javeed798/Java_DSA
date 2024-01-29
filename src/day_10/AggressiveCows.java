package day_10;

public class AggressiveCows {

    public static int getMinimumDistance(int arr[], int minCows) {
        int low = arr[0];
        int high = arr[arr.length - 1];
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isItPossible(arr, minCows, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int arr[], int minCows, int mid) {
        int cowsCount = 1;
        int pos = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - pos >= mid) {
                cowsCount++;
                pos = arr[i];
            }

            if (cowsCount == minCows) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        System.out.println(getMinimumDistance(arr,3));
    }
}
