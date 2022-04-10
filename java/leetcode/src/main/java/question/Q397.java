package question;

public class Q397 {
    public int integerReplacement(int n) {
        int result = 0;
        long num = n;

        while (num != 1) {
            result++;

            if ((num & 1) == 1) {
                if ((num & 3) == 3 && num != 3) {
                    num++;
                } else {
                    num--;
                }
            } else {
                num >>= 1;
            }
        }

        return result;
    }
}

/*
397. Integer Replacement
 */
