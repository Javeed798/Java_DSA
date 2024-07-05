package Twenty_Twenty_Four_2024.day_3;

public class MaxSubArray {

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,1,7,4,6,8};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int x = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            if(sum > x) {
                x = sum;
            }
        }

        return x;
    }

}
