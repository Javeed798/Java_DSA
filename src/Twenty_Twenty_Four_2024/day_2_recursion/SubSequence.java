package Twenty_Twenty_Four_2024.day_2_recursion;

public class SubSequence {
    public static void main(String[] args) {
        subSequence("abc", "");
        System.out.println();
        subSequenceBruteForce("abc");
    }

    public static void subSequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        subSequence(str.substring(1), ans);
        subSequence(str.substring(1), ans + ch);
    }

    public static void subSequenceBruteForce(String str) {
        int n = str.length();
        int subSequences = (int) Math.pow(2, n);

        for (int i = 0; i < subSequences; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            int num = i;
            for (int j = 0; j < n; j++) {
                if (num % 2 == 1) {
                    stringBuilder.append(str.charAt(j));
                }
                num /= 2;
            }
            System.out.print(stringBuilder + " ");
        }
    }
}
