package Twenty_Twenty_Four_2024.day_2_recursion;

public class Print_Inc {
    public static void main(String[] args) {
        print_inc(10);
    }

    public static void print_inc(int n) {
        if (n == 0) {
            return;
        }

        print_inc(n - 1);
        System.out.print(n + " ");
    }
}
