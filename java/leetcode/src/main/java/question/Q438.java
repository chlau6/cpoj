package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q438 {
    /*
    Sliding Window
     */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        int m = s.length();
        int n = p.length();
        int count = n;
        int[] map = new int[256];

        for (int k = 0; k < count; k++) {
            map[p.charAt(k)]++;
        }

        while (j < m) {
            if (map[s.charAt(j++)]-- >= 1) {
                count--;
            }

            if (count == 0) {
                result.add(i);
            }

            if (j - i == n && map[s.charAt(i++)]++ >= 0) {
                count++;
            }
        }

        return result;
    }

    /*
    Hash Table
     */
    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int m = s.length();
        int n = p.length();

        if (m < n) return result;

        int[] m1 = new int[256];
        int[] m2 = new int[256];

        for (int i = 0; i < n; i++) {
            m1[s.charAt(i)]++;
            m2[p.charAt(i)]++;
        }

        if (Arrays.equals(m1, m2)) {
            result.add(0);
        }

        for (int i = n; i < m; i++) {
            m1[s.charAt(i)]++;
            m1[s.charAt(i - n)]--;

            if (Arrays.equals(m1, m2)) {
                result.add(i - n + 1);
            }
        }

        return result;
    }
}

/*
437. Path Sum III
 */
