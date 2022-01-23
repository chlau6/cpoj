package question;

public class Q541 {
    public String reverseStr(String s, int k) {
        int length = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < length; i += 2 * k) {
            int head = i;
            int tail = Math.min(i + k - 1, length - 1);

            while (head < tail) {
                char temp = chars[head];
                chars[head++] = chars[tail];
                chars[tail--] = temp;
            }
        }

        return new String(chars);
    }
}

/*
541. Reverse String II
 */
