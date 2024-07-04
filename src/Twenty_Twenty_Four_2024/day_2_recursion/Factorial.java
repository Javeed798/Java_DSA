package Twenty_Twenty_Four_2024.day_2_recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n) {

        if (n == 1) {
            return 1;
        }

        int fn = fact(n - 1);
        return n * fn;
    }
}
