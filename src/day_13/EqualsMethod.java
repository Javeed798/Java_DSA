package day_13;

public class EqualsMethod {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(equals(s1, s3));

    }

    public static boolean equals(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
