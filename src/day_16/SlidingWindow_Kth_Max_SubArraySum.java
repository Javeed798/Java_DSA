package day_16;

public class SlidingWindow_Kth_Max_SubArraySum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 440, 5, 6, 7, 8,3,4,5,6,66};
        int i = subArrayMaxSum(arr, 3);
        System.out.println(i);
    }

    public static int subArrayMaxSum(int[] arr, int k) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i< k;i++) {
            sum += arr[i];
        }
        ans = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i-k];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
