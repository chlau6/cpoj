package question;

public class Q1323 {
    public int maximum69Number (int num) {
        int maxPos = 0;
        int pos = 1;

        int n = num;

        while (n > 0) {
            if (n % 10 == 6) {
                maxPos = pos;
            }

            n /= 10;
            pos *= 10;
        }

        return num + 3 * maxPos;
    }
}

/*
1323. Maximum 69 Number
 */
