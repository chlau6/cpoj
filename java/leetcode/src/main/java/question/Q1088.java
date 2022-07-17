package question;

import java.util.HashMap;
import java.util.Map;

public class Q1088 {
    int result = 0;

    public int confusingNumberII(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(6, 9);
        map.put(8, 8);
        map.put(9, 6);

        helper(map, 0, n);

        return result;
    }

    public void helper(Map<Integer, Integer> map, int curr, int n) {
        if (isConfusingNum(map, curr)) result++;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey();

            if (curr * 10 + key <= n && curr * 10 + key > 0) {
                helper(map, curr * 10 + key, n);
            }
        }
    }

    public boolean isConfusingNum(Map<Integer, Integer> map, int num) {
        long oldNum = num;
        int result = 0;

        while (num > 0) {
            if (!map.containsKey(num % 10)) return false;
            result = result * 10 + map.get(num % 10);
            num /= 10;
        }

        return result != oldNum;
    }
}

/*
1088. Confusing Number II
 */
