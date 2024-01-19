package tap_revision.mathematics;

public class Factorial {
    public static void main(String[] args) {

        int n = 15;
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *=  i;
        }
        return res;
    }
}
