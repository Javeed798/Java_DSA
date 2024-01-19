package tap_revision.mathematics;

public class TrailingZeroes {
    public static void main(String[] args) {
        int n = 200;
        System.out.println(trailingZeroes(n));
    }

    static int trailingZeroes(int n) {
        int res = 0;
        int powOf5 = 5;
        while (n >= powOf5) {
            res = res + (n / powOf5);
            powOf5 = powOf5 * 5;
        }
        return res;
    }
}
