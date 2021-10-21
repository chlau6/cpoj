package question;

import annotation.BinarySearch;
import annotation.Interactive;
import company.Facebook;

@BinarySearch
@Interactive
@Facebook
public class Q278 {
    /*
    Binary Search
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 0;
            int right = n;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (isBadVersion(mid)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return left;
        }
    }

    public class VersionControl {
        public boolean isBadVersion(int version) {
            return true;
        }
    }
}

/*
278. First Bad Version
 */
