package question;

public class Q2138 {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int size = n / k + (n % k == 0 ? 0 : 1);
        String[] result = new String[size];
        int pad = k - n % k;
        int j = 0;

        StringBuilder builder = new StringBuilder(s);

        for (int i = 0; i < pad; i++) {
            builder.append(fill);
        }

        for (int i = 0; i < n; i += k) {
            result[j++] = builder.substring(i, i + k);
        }

        return result;
    }
}
/*
2138. Divide a String Into Groups of Size k
 */
