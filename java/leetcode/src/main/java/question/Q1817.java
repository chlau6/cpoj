package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int[] result = new int[k];

        for (int[] log : logs) {
            int user = log[0];
            int min = log[1];

            Set<Integer> set = map.computeIfAbsent(user, key -> new HashSet<>());
            set.add(min);
        }

        for (Set<Integer> v : map.values()) {
            int uam = v.size();

            result[uam - 1]++;
        }

        return result;
    }
}

/*
1817. Finding the Users Active Minutes
 */
