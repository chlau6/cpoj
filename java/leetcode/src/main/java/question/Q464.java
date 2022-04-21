package question;

import java.util.HashMap;
import java.util.Map;

public class Q464 {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (maxChoosableInteger >= desiredTotal) return true;
        if (arithmeticSum(maxChoosableInteger) < desiredTotal) return false;

        Map<Integer, Boolean> map = new HashMap<>();

        return canWin(map, maxChoosableInteger, desiredTotal, 0);
    }

    public boolean canWin(Map<Integer, Boolean> map, int n, int total, int used) {
        if (map.containsKey(used)) return map.get(used);

        for (int i = 0; i < n; i++) {
            int curr = (1 << i);

            if ((curr & used) != 0) continue;

            if (total <= i + 1 || !canWin(map, n, total - (i + 1), curr | used)) {
                map.put(used, true);
                return true;
            }
        }

        map.put(used, false);
        return false;
    }

    public int arithmeticSum(int x) {
        return (1 + x) * x / 2;
    }
}

/*
464. Can I Win
 */
