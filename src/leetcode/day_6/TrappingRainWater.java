package leetcode.day_6;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {0,2,4,1,5,8,6,99,1,2,55,8,9};
        int n = arr.length;
        int left[] = new int[n];
        left[0] = arr[0];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1],arr[i]);
        }

        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1],arr[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.min(left[i],right[i]) - arr[i];
        }

        System.out.println(sum);
    }
}
