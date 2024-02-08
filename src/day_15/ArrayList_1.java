package day_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayList_1 {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 4, 5 , 5, 6 , 6, 7};
        Add(arr1, arr2);

    }

    public static void Add(int arr1[], int arr2[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;

        while (i>=0 &&j>=0) {
            int sum = arr1[i] + arr2[j] + carry;
            al.add(sum % 10);
            carry = sum/10;
            i--;
            j--;
        }

        while (i >= 0) {
            int sum = arr1[i] + carry;
            al.add(sum % 10);
            carry = sum/10;
            i--;
        }

        while (j>=0) {
            int sum = arr2[j] + carry;
            al.add(sum % 10);
            carry = sum/10;
            j--;
        }

        if (carry> 0) {
            al.add(carry);
        }
        System.out.print(al + " ");
        System.out.println();
        for (int k = al.size()-1; k >=0 ; k--) {
            System.out.print(al.get(k) + " ");
        }
    }
}
