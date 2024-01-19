package tap_revision.mathematics;

public class GcdOrHcf {
    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        for (int i = min; i >= 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }

    }
}
