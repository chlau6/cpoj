package question;

import annotation.StringMatching;
import annotation.Strings;
import annotation.TwoPointers;

@TwoPointers
@Strings
@StringMatching
public class Q28 {
    /*
    Time Complexity: O(m * n)   Space Complexity: O(m + n)
     */
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int length = haystack.length();
        int size = needle.length();
        char[] hays = haystack.toCharArray();
        char[] need = needle.toCharArray();

        for (int i = 0; i <= length - size; i++) {
            int j;
            for (j = 0; j < size; j++) {
                if (hays[i + j] != need[j]) {
                    break;
                }
            }
            if (j == size) return i;
        }
        return -1;
    }
}

/*
28. Implement strStr()
 */
