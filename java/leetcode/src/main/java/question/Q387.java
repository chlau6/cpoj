package question;

public class Q387 {
    /*
    Time Complexity: O(n)    Space Complexity: O(n)
     */
    public int firstUniqChar(String s) {
        int[] counts = new int[26];
        char[] chars = s.toCharArray();

        for (char c : chars) {
            counts[c - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (counts[chars[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}

/*
387. First Unique Character in a String
 */
