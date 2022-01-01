package question;

public class Q1684 {
    /*
    Time Complexity: O(mn + k)   Space Complexity: O(max(k, m))
     */
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allow = new boolean[26];
        int result = words.length;

        for (char c : allowed.toCharArray()) {
            allow[c - 'a'] = true;
        }

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (!allow[c - 'a']) {
                    result--;
                    break;
                }
            }
        }

        return result;
    }
}

/*
1684. Count the Number of Consistent Strings
 */
