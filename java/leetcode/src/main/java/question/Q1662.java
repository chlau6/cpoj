package question;

public class Q1662 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(1)
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int a1 = 0;
        int a2 = 0;
        int c1 = 0;
        int c2 = 0;
        int n1 = word1.length;
        int n2 = word2.length;

        while (a1 < n1 && a2 < n2) {
            if (word1[a1].charAt(c1) != word2[a2].charAt(c2)) return false;

            if (c1 == word1[a1].length() - 1) {
                a1++;
                c1 = 0;
            } else {
                c1++;
            }

            if (c2 == word2[a2].length() - 1) {
                a2++;
                c2 = 0;
            } else {
                c2++;
            }
        }

        return a1 == n1 && a2 == n2;
    }
}

/*
1662. Check If Two String Arrays are Equivalent
 */
