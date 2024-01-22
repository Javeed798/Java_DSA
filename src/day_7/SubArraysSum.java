package day_7;

public class SubArraysSum {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length;j++) {
//                System.out.print(arr[i] + " " + arr[j]);
//            }
//            System.out.println();
//        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
}
