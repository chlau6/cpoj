package question;

public class Q1528 {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        int length = s.length();

        for (int i = 0; i < length; i++) {
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }
}

/*
1528. Shuffle String
 */
