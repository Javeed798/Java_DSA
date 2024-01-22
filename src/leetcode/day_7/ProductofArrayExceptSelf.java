package leetcode.day_7;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {

        int arr[] = {1, 5, 8, 9, 24,55,65};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        int[] ints = productOfArrayExceptSelf(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

    public static int[] productOfArrayExceptSelf(int arr[]) {
        int n = arr.length;
        int left[] = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }

        int right[] = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = arr[i + 1] * right[i + 1];
        }

        int neeArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            neeArr[i] = left[i] * right[i];
        }
        return neeArr;
    }
}
