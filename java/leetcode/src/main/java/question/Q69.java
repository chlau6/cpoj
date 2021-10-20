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

        int left = 0;
        int right = x;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (x / mid >= mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left - 1;
    }
}

/*
69. Sqrt(x)
 */
