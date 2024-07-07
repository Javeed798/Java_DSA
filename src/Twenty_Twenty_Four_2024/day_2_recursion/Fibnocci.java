package Twenty_Twenty_Four_2024.day_2_recursion;

public class Fibnocci {

    public static void main(String[] args) {
        System.out.println(fibnocci(10));

        System.out.println(fibnocciBruteForce(10));
    }

    public static int fibnocci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int f1 = fibnocci(n - 1);
        int f2 = fibnocci(n - 2);
        return f1 + f2;
    }

    public static int fibnocciBruteForce(int n) {

        int ans1 = 0;
        int ans2 = 1;
        int ans = 0;

        for (int i = 1; i < n; i++) {
            ans = ans1 + ans2;
            ans1 = ans2;
            ans2 = ans;
        }
        return ans;
    }
}
