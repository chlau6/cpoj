package question;

import annotation.HashTable;
import annotation.Maths;
import annotation.TwoPointers;

import java.util.HashSet;
import java.util.Set;

@HashTable
@Maths
@TwoPointers
public class Q202 {
    /*
    Time Complexity: O(1)   Space Complexity: O(n)
     */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (set.add(n)) {
            int sum = 0;

            while (n > 0) {
                int remain = n % 10;
                sum += remain * remain;
                n /= 10;
            }

            if (sum == 1) return true;

            n = sum;
        }
        return false;
    }
}

/*
202. Happy Number
 */
