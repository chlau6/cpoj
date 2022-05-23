package question;

public class Q1540 {
    public boolean canConvertString(String s, String t, int k) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (c1 == c2) continue;

            int diff = (c2 - c1 + 26) % 26;

            if (count[diff] * 26 + diff > k) return false;

            count[diff]++;
        }

        return true;
    }
}

/*
1540. Can Convert String in K Moves
 */
