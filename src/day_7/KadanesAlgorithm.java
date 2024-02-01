package day_7;

public class KadanesAlgorithm {
    public static void main(String[] args) {

        int arr[] = {-10 - 2 - 3 - 4};

//        int sum = 0;
//        int ans=Integer.MIN_VALUE;
//
//        for(int i=0; i<arr.length;i++) {
//            sum = sum + arr[i];
//            ans = Math.max(ans,sum);
//            if (sum < 0) {
//                sum = 0;
//            }
//        }
//        System.out.println(ans);

        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            /*
            so here nums[i] is like if we found any other element greater than my prevElement and currentElement... i need to change that
            if i didn't find my current element as greater element i need to proceed with adding my current element and my current max
             */
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        System.out.println(globalMax);
    }
}
