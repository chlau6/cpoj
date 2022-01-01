package question;

import java.util.HashSet;
import java.util.Set;

public class Q771 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(m + n)
     */
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int count = 0;

        for (char c : jewels.toCharArray()) {
            set.add(c);
        }

        for (char c : stones.toCharArray()) {
            if (set.contains(c)) count++;
        }

        return count;
    }
}

/*
771. Jewels and Stones
 */
