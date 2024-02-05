package day_13;

public class SubStringsWithLengthWise {
    public static void main(String[] args) {
        String s = "83415";

        for (int len = 0; len <= s.length();len++) {
            for (int j = len; j <= s.length();j++) {
                // int len = j - i  =>  interchange
                int i = j - len;
                System.out.print(s.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
