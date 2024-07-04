package Twenty_Twenty_Four_2024.day_2_recursion;

public class SubSequence {
    public static void main(String[] args) {
        subSequence("abc","");
    }

    public static void subSequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        subSequence(str.substring(1),ans);
        subSequence(str.substring(1), ans + ch);
    }
}
