package question;

public class Q2103 {
    public int countPoints(String rings) {
        int n = rings.length();
        int[] count = new int[10];
        char[] r = rings.toCharArray();
        int result = 0;

        for (int i = 0; i < n; i += 2) {
            int color = 0;
            int pos = r[i + 1] - '0';

            if (r[i] == 'R') {
                color = 1;
            } else if (r[i] == 'G') {
                color = 2;
            } else {
                color = 4;
            }

            count[pos] |= color;
        }

        for (int c : count) {
            if (c == 7) result++;
        }

        return result;
    }
}
/*
2103. Rings and Rods
 */
