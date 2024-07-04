package Twenty_Twenty_Four_2024.day_2_recursion;

public class PowerOfX {
    public static void main(String[] args) {
        System.out.println(power(4,5));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int ans = power(x,n-1);
        return ans * x;
    }
}
