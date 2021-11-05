package question;

import annotation.Array;
import annotation.Strings;

@Array
@Strings
public class Q944 {
    /*
    Time Complexity: O(mn)  Space Complexity: O(1)
     */
    public int minDeletionSize(String[] strs) {
        int length = strs[0].length();
        int result = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }
}

/*
944. Delete Columns to Make Sorted
 */
