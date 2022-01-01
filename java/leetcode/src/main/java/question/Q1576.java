package question;

public class Q1576 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            if (chars[i] != '?') continue;

            for (char j = 'a'; j < 'd'; j++) {
                if (i > 0 && chars[i - 1] == j) continue;

                if (i + 1 < length && chars[i + 1] == j) continue;

                chars[i] = j;

                break;
            }
        }

        return new String(chars);
    }
}

/*
1576. Replace All ?'s to Avoid Consecutive Repeating Characters
 */
