package Twenty_Twenty_Four_2024.day_6_revison_arrays;

public class PaintersPartition {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        System.out.println(maxTime(arr,2,2));
    }

    // i need to calculate how much time it will take its same like the book allocation problem
    // exactly same
    public static int maxTime(int arr[], int a, int b) {
        int low = 0;
        int high = 0;
        int mid = 0;
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
        }

        while (low <= high) {
            mid = (low + high) / 2;

            if (isPossibleSolution(arr, a, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res * b;
    }

    public static boolean isPossibleSolution(int arr[], int a, int mid) {
        int painters = 1;
        int pbc = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                return false;
            }

            if (pbc + arr[i] <= mid) {
                pbc += arr[i];
            } else {
                painters++;
                if (painters > a) {
                    return false;
                }
                pbc = arr[i];
            }
        }
        return true;
    }
}
