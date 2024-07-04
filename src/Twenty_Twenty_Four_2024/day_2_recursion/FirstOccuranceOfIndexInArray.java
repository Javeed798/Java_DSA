package Twenty_Twenty_Four_2024.day_2_recursion;

public class FirstOccuranceOfIndexInArray {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,7,8};
        System.out.println(firstIndex(arr,0,10));
    }

    public static int firstIndex (int arr[], int i, int item) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == item) {
            return i;
        }


        return firstIndex(arr,i+1, item);
    }
}
