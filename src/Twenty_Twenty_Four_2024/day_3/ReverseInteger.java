package Twenty_Twenty_Four_2024.day_3;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(n%10);
        System.out.println(n/10);

        System.out.println(reverse(n));
    }

    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int value = n % 10;
            n = n / 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && value > 7)) {
                return 0; // Overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && value < -8)) {
                return 0; // Underflow
            }
            reversed = reversed * 10 + value;
        }
        return reversed;
    }
}
