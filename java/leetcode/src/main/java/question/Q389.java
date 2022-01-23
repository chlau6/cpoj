package question;

public class Q389 {
    public char findTheDifference(String s, String t) {
        int xor = 0;

        int length = s.length();

        for (int i = 0; i < length; i++) {
            xor = xor ^ s.charAt(i) ^ t.charAt(i);
        }

        return (char) (xor ^ t.charAt(length));
    }
}

/*
389. Find the Difference
 */
