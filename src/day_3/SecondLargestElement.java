package day_3;

public class SecondLargestElement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8,9};
        System.out.println(secondLargest(arr));

    }

    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > thirdMax && arr[i] != max && arr[i] !=secondMax){
                thirdMax = arr[i];
            }
        }
        return thirdMax;
    }
}
