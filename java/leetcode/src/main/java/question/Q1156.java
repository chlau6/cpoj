package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1156 {
    public int maxRepOpt1(String text) {
        Map<Character, List<Integer>> map = new HashMap<>();
        int n = text.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);

            map.putIfAbsent(c, new ArrayList<>());

            map.get(c).add(i);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            int count1 = 1;
            int count2 = 0;
            int max = 0;

            if (!map.containsKey(c)) continue;

            List<Integer> pos = map.get(c);

            for (int i = 1; i < pos.size(); i++) {
                if (pos.get(i - 1) + 1 == pos.get(i)) {
                    count1++;
                } else if (pos.get(i - 1) + 2 == pos.get(i)) {
                    count2 = count1;
                    count1 = 1;
                } else {
                    count2 = 0;
                    count1 = 1;
                }

                max = Math.max(max, count1 + count2);
            }

            result = Math.max(result, max + (pos.size() > max ? 1 : 0));
        }

        return result;
    }
}

/*
1156. Swap For Longest Repeated Character Substring
 */
