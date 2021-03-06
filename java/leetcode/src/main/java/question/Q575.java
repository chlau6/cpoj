package question;

import java.util.HashSet;
import java.util.Set;

public class Q575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for (int type : candyType) {
            set.add(type);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
}

/*
575. Distribute Candies
 */
