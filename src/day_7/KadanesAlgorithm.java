package day_7;

public class KadanesAlgorithm {
    public static void main(String[] args) {

        int arr[] = {1, 2 , 3, 4, 5, 6, 7};

        int sum = 0;
        int ans=0;

        for(int i=0; i<arr.length;i++) {
            sum = sum + arr[i];
            ans = Math.max(ans,sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(ans);
    }
}
