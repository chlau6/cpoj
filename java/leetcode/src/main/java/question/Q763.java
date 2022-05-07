package question;

import java.util.ArrayList;
import java.util.List;

public class Q763 {
    public List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        char[] str = s.toCharArray();
        List<Integer> result = new ArrayList<>();
        int n = s.length();
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            map[str[i] - 'a'] = i;
        }

        for (int i = 0; i < n; i++) {
            end = Math.max(end, map[str[i] - 'a']);

            if (end == i) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }

        return result;
    }
}

/*
763. Partition Labels
 */

