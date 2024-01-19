package tap_revision.mathematics;

public class LameAlgoGCD {
    public static void main(String[] args) {

        int a = 15;
        int b = 20;

        while ( a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a != 0) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
