package question;

import annotation.BinarySearch;
import annotation.Interactive;

@BinarySearch
@Interactive
public class Q374 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public class Solution extends GuessGame {
        public boolean isPerfectSquare(int num) {
            long left = 0;
            long right = num;

            while (left <= right) {
                long mid = left + (right - left) / 2;
                long square = mid * mid;

                if (square == num) return true;
                else if (square < num) left = mid + 1;
                else right = mid - 1;
            }

            return false;
        }
    }

    class GuessGame {
        public boolean guess(int num) {
            return true;
        }
    }
}


/*
374. Guess Number Higher or Lower
 */
