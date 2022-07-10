package question;

import java.util.HashMap;
import java.util.Map;

public class Q2244 {
    public int minimumRounds(int[] tasks) {
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int t : tasks) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        for (int freq : map.values()) {
            if (freq < 2) return -1;

            result += freq % 3 > 0 ? freq / 3 + 1 : freq / 3;
        }

        return result;
    }
}

/*
2244. Minimum Rounds to Complete All Tasks
 */
