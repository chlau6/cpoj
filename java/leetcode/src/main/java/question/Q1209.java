package question;

public class Q1209 {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        char[] stack = s.toCharArray();
        int[] count = new int[n];

        int j = 0;

        for (int i = 0; i < n; i++, j++) {
            stack[j] = stack[i];

            if (j > 0 && stack[j] == stack[j - 1]) {
                count[j] = count[j - 1] + 1;
            } else {
                count[j] = 1;
            }

            if (count[j] == k) {
                j -= k;
            }
        }

        return new String(stack, 0, j);
    }
}

/*
1209. Remove All Adjacent Duplicates in String II
 */
