package question;

public class Q2078 {
    public int maxDistance(int[] colors) {
        int result = 0;
        int n = colors.length;

        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                result = n - 1 - i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                result = Math.max(result, i);
                break;
            }
        }

        return result;
    }
}
/*
2078. Two Furthest Houses With Different Colors
 */
