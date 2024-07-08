package Twenty_Twenty_Four_2024.day_4;

public class SubSequenceCount {
    public static void main(String[] args) {

        String ques = "abc";
        subSequence(ques, "");
        System.out.println(count);

        System.out.println(subSequence1(ques,""));
    }

    static int count = 0;

    public static void subSequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            count++;
            return;
        }
        char ch = str.charAt(0);
        subSequence(str.substring(1), ans);
        subSequence(str.substring(1), ans + ch);
    }

    public static int subSequence1(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return 1;
        }

        char ch = str.charAt(0);
        int a1 = subSequence1(str.substring(1), ans);
        int a2 = subSequence1(str.substring(1), ch + ans);
        return a1 + a2;
    }
}
