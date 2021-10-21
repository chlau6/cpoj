package question;

import annotation.BinarySearch;
import annotation.Maths;

@Maths
@BinarySearch
public class Q69 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public int mySqrt(int x) {
        if (x <= 1) return x;

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int quotient = x / mid;

            if (quotient == mid) {
                return mid;
            } else if (quotient > mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}

/*
69. Sqrt(x)
 */
