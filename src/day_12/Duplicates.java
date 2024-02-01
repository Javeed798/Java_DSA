package day_12;


/*
    Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.
    Return the answer in ascending order. If no such element is found, return list containing [-1].

    Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array.

 */

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int N = 4;
        int a[] = {0, 3, 1, 2};

        System.out.println(duplicates(a, N));
    }

    /*
        1. Given an array a of size N which contains elements from 0 to N-
        2. First I will create a new ArrayList of Integer type
        3. Then I will sort my given input array (Because if i have dups it will come side by side and it will be easier for me to compare)
        4. then i will run on loop to compare my logic
        5. inside my loop i will run one more loop to check if my current index have reached to the end of the array or not or i can assume i have '
            found the duplicate so now i can just loop through my array till end
        6. then i will exit the loop and i will check my list is empty or not. If its empty i will say add -1
        7. if not empty just return my list
     */

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                list.add(arr[i]);
            }

            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        return list;
    }
}
