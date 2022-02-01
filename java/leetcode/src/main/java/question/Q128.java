package question;

import java.util.HashSet;
import java.util.Set;

public class Q128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (!set.remove(num)) continue;

            int prev = num - 1;
            int next = num + 1;

            while (set.contains(prev)) {
                set.remove(prev--);
            }

            while (set.contains(next)) {
                set.remove(next++);
            }

            result = Math.max(result, next - prev - 1);
        }

        return result;
    }
}
/*
128. Longest Consecutive Sequence
 */