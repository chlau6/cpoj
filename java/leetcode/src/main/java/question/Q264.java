package question;

public class Q264 {
    public int nthUglyNumber(int n) {
        int[] result = new int[n];

        int two = 0;
        int three = 0;
        int five = 0;

        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = Math.min(result[two] * 2, Math.min(result[three] * 3, result[five] * 5));

            if (result[i] == result[two] * 2) {
                two++;
            }

            if (result[i] == result[three] * 3) {
                three++;
            }

            if (result[i] == result[five] * 5) {
                five++;
            }
        }

        return result[n - 1];
    }
}

/*
264. Ugly Number II
 */