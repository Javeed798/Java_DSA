package day_12;

public class Merge2Arrays {
    public static void main(String[] args) {

        int[] arr1 = {3, 13,9865,856,562,5};
        int[] arr2 = {1, 19,3,4,2};

        int[] merged = mergeThem(arr1, arr2);

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length + arr2.length];

        int i, j = 0, k = 0;
        for (i = 0; i < result.length; i++) {
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    result[k] = arr1[i];
                    k++;
                    i++;
                } else {
                    result[k] = arr2[j];
                    k++;
                    j++;
                }
            }
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            k++;
            j++;
        }

        while (j < arr2.length) {
            result[k] = arr2[j];
            k++;
            j++;
        }

        return result;
    }

    public static int[] mergeThem(int[] arr1, int[] arr2) {
        int result[] = new int[arr1.length + arr2.length];

        int i, j = 0, k = 0;
        for (i = 0; i < arr1.length; i++) {
           result[k] = arr1[i];
           k++;
        }

        for (j = 0; j < arr2.length; j++) {
            result[k] = arr2[j];
            k++;
        }

        return result;
    }


}
