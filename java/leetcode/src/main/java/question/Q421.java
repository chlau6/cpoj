package question;

import java.util.HashSet;
import java.util.Set;

public class Q421 {
    public int findMaximumXOR(int[] nums) {
        int result = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {
            Set<Integer> set = new HashSet<>();
            mask |= (1 << i);

            for (int num : nums) {
                set.add(num & mask);
            }

            int temp = result | (1 << i);

            for (int prefix : set) {
                if (set.contains(temp ^ prefix)) {
                    result = temp;
                    break;
                }
            }
        }

        return result;
    }
}

/*
421. Maximum XOR of Two Numbers in an Array
 */
