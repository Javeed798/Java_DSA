package day_16;

public class SlidingWindow_Kth_Max_SubArraySum {

    // is the problem is about to find the sub arrays, sub strings and also with some minima and maxima we blindly go for using this sliding window technique
    // let the fun begins. :)
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
