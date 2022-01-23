package question;

public class Q868 {
    public int binaryGap(int n) {
        int result = 0;
        int start = -1;

        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                if (start >= 0) {
                    result = Math.max(result, i - start);
                }
                start = i;
            }
        }

        return result;
    }
}

/*
868. Binary Gap
 */
