package Twenty_Twenty_Four_2024.day_4;

public class CoinToss {
    public static void main(String[] args) {  

        int n = 10;
        coinToss(n,"");

    }

    public static void coinToss(int n, String ans) {
        if (n == 0) {
            System.out.print(ans + " ");
            return;
        }

        coinToss(n-1,ans+"T");
        coinToss(n-1,ans+"H");
    }
}
