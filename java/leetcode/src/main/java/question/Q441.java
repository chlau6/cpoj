package question;

public class Q441 {
    public int arrangeCoins(int n) {
        return (int) (-1 + Math.sqrt(1 + 8 * (long) n)) / 2;
    }
}
/*
441. Arranging Coins
 */
