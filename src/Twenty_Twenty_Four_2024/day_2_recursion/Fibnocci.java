package Twenty_Twenty_Four_2024.day_2_recursion;

public class Fibnocci {

    public static void main(String[] args) {
        System.out.println(fibnocci(5));
    }

    public static int fibnocci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int f1 = fibnocci(n-1);
        int f2 = fibnocci(n-2);
        return f1 + f2;
    }
}
