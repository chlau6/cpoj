package question;

public class Q1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int result = 0;
        int i = 0;

        for (int j = 0; j < n; j++) {
            int diff = Math.abs(s.charAt(j) - t.charAt(j));

            while (diff > maxCost) {
                maxCost += Math.abs(s.charAt(i) - t.charAt(i));
                i++;
            }

            maxCost -= diff;
            result = Math.max(result, j - i + 1);
        }

        return result;
    }
}

/*
1208. Get Equal Substrings Within Budget
 */
