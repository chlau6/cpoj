package question;

public class Q1941 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean areOccurrencesEqual(String s) {
        int[] counts = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            counts[s.charAt(i) - 'a']++;
        }

        int prev = counts[s.charAt(0) - 'a'];

        for (int count : counts) {
            if (count != 0 && count != prev) return false;
        }

        return true;
    }
}

/*
1941. Check if All Characters Have Equal Number of Occurrences
 */
