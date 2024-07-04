package Twenty_Twenty_Four_2024.day_2_recursion;

public class Print_Dec {

    public static void main(String[] args) {
        print_dec(10);
    }

    public static void print_dec(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        print_dec(n-1);
    }
}
