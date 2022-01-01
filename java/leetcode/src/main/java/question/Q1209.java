package question;

public class Q1209 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String removeDuplicates(String s, int k) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int[] count = new int[len];
        int i = 0;
        int j = 0;

        while (i < len) {
            chars[j] = chars[i];

            if (j > 0 && chars[j] == chars[j - 1]) {
                count[j] = count[j - 1] + 1;
            } else {
                count[j] = 1;
            }

            if (count[j] == k) {
                j -= k;
            }

            i++;
            j++;
        }

        return new String(chars, 0, j);
    }
}

/*
1209. Remove All Adjacent Duplicates in String II
 */
