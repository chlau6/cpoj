package question;

public class Q777 {
    public boolean canTransform(String start, String end) {
        int m = start.length();
        int n = end.length();
        int p1 = 0;
        int p2 = 0;

        while (p1 < m || p2 < n) {
            while (p1 < m && start.charAt(p1) == 'X') p1++;
            while (p2 < n && end.charAt(p2) == 'X') p2++;

            if (p1 >= m || p2 >= n) break;

            if (start.charAt(p1) != end.charAt(p2)) {
                return false;
            }

            if (start.charAt(p1) == 'L' && p1 < p2) {
                return false;
            }

            if (start.charAt(p1) == 'R' && p1 > p2) {
                return false;
            }

            p1++;
            p2++;
        }

        return p1 == p2;
    }
}

/*
777. Swap Adjacent in LR String
 */

