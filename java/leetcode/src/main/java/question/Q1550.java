package question;

import annotation.Array;

@Array
public class Q1550 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                return true;
            }
        }

        return false;
    }
}

/*
1550. Three Consecutive Odds
 */
