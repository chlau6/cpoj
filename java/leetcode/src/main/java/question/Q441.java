package question;

import annotation.BinarySearch;
import annotation.Maths;

@Maths
@BinarySearch
public class Q441 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public int arrangeCoins(int n) {
        return (int) (-1 + Math.sqrt(1 + 8 * (long) n)) / 2;
    }
}
/*
441. Arranging Coins
 */
