package question;

public class Q1961 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean isPrefixString(String s, String[] words) {
        int n = s.length();

        int i = 0;
        for (String word : words) {
            int len = word.length();

            for (int j = 0; j < len; j++) {
                if (i == n || s.charAt(i++) != word.charAt(j)) {
                    return false;
                }
            }

            if (i == n) return true;
        }

        return false;
    }
}
/*
1961. Check If String Is a Prefix of Array
 */
