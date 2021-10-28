package question;

import annotation.Array;
import annotation.Greedy;

@Array
@Greedy
public class Q860 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                five--;
                ten++;
            } else if (ten > 0) {
                ten--;
                five--;
            } else {
                five -= 3;
            }

            if (five < 0) return false;
        }

        return true;
    }
}

/*
860. Lemonade Change
 */
