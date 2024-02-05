package day_13;

public class CompareTo {
    public static void main(String[] args) {
//        returning the value in the dictionary order.
        String s1 = "ninjaaaa";
        String s2 = "ninjaaaa";
        System.out.println(compareTo(s1, s2));

    }

    // if s2 is bigger we get ans in negatives
    // is s1 is bigger we get ans in positive
    // if both are equal then 0

    public static int compareTo(String s1, String s2) {
        if (s1 == s2)
            return 0;

        for (int i = 0; i< Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i)  - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
     }
}
