package question;

public class Q1486 {
    public int xorOperation(int n, int start) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result ^= start + 2 * i;
        }

        return result;
    }
}

/*
1486. XOR Operation in an Array
 */
