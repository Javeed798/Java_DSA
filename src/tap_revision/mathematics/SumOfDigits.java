package tap_revision.mathematics;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 85421;
        int sum = 0;
        while (n>0) {
            int x = n % 10;
            sum += x;
            n = n/10;
        }
        System.out.println(sum);
    }
}
