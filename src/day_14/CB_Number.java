package day_14;

public class CB_Number {
    public static void main(String[] args) {
        String s = "127";
        System.out.println(cb_numberCount(s));
    }

    public static int cb_numberCount(String s) {
        int count = 0;
        boolean valid[] = new boolean[s.length()];
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                String s1 = s.substring(i, j);
                long n = Long.parseLong(s1);
                if (isCbNumber(n) && isValid(valid, i, j)) {
                    count++;
                    for (int k = i; k < valid.length; k++) {
                        valid[k] = true;
                    }
                }
            }
        }
        return count;
    }


    public static boolean isCbNumber(long nums) {
        if (nums == 1 || nums == 0) {
            return false;
        }

        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 29};
        for (int i = 0; i < arr.length; i++) {
            if (nums == arr[i]) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (nums % arr[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(boolean[] valid, int i, int j) {
        for (; i < j; i++) {
            if (valid[i]) {
                return false;
            }
        }
        return true;

    }
}
