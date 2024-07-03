package twenty_twenty_four_2024.day_1;

/*
Kartik Bhaiya has a string consisting of only 'a' and 'b' as the characters. Kartik Bhaiya describes perfectness of a string as the maximum length substring of equal characters. Kartik Bhaiya is given a number k which denotes the maximum number of characters he can change. Find the maximum perfectness he can generate by changing no more than k characters.

Input Format
The first line contains an integer denoting the value of K. The next line contains a string having only ‘a’ and ‘b’ as the characters.

Constraints
2 ≤ N ≤ 10^6

Output Format
A single integer denoting the maximum perfectness achievable.

Sample Input
2
abba
Sample Output
4
Explanation
We can swap the a's to b using the 2 swaps and obtain the string "bbbb". This would have all the b's and hence the answer 4.
Alternatively, we can also swap the b's to make "aaaa". The final answer remains the same for both cases.

 */

public class SubArrayStringKartik {
    public static void main(String[] args) {
        String str = "abaabbaaaaabbb";

        System.out.println(subArrayStaticSum(str,3,'b'));


    }

    public static int subArrayStaticSum(String str, int k, char ch) {
        int si = 0;
        int ei = 0;

        int ans = 0;
        int flip = 0;

        while (ei < str.length()) {

//            growing
            if(str.charAt(ei) == ch) {
                flip++;
            }
//            shrinking

            while (flip > k && si <= ei) {
                if(str.charAt(ei) == ch) {
                    flip--;
                }
                si++;
            }

//            calculate
            ans = Math.max(ans, (ei-si+1));
            ei++;
        }
        return ans;
    }
}
