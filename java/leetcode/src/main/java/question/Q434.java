package question;

public class Q434 {
    public int countSegments(String s) {
        int count = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') continue;

            count++;

            while (i < length && s.charAt(i) != ' ') i++;
        }

        return count;
    }
}
/*
434. Number of Segments in a String
 */
