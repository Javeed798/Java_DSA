package Twenty_Twenty_Four_2024.day_2_recursion;

public class Factorial_Head_Recursion {

    public static void main(String[] args) {
        System.out.println(fact(5,1));
    }

    public static int fact(int n, int ans) {

        if (n == 0) {
            return ans;
        }

        return fact(n-1, ans * n);
    }
}
