package question;

import java.util.HashSet;
import java.util.Set;

public class Q2154 {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(original)) {
            original *= 2;
        }

        return original;
    }
}

/*
2154. Keep Multiplying Found Values by Two
 */
