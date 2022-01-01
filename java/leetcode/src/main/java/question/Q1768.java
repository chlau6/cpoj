package question;

public class Q1768 {
    /*
    Time Complexity: O(m + n)   Space Complexity: O(m + n)
     */
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int n1 = word1.length();
        int n2 = word2.length();
        var builder = new StringBuilder();

        while (i < n1 && j < n2) {
            builder.append(word1.charAt(i++));
            builder.append(word2.charAt(j++));
        }

        if (i < n1) builder.append(word1, i, n1);
        else if (j < n2) builder.append(word2, j, n2);

        return builder.toString();
    }
}

/*
1768. Merge Strings Alternately
 */
