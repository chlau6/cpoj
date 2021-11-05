package question;

import annotation.Strings;
import annotation.TwoPointers;

@TwoPointers
@Strings
public class Q925 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int nLength = name.length();
        int tlength = typed.length();

        for (int j = 0; j < tlength; j++) {
            if (i < nLength && name.charAt(i) == typed.charAt(j)) i++;
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) return false;
        }

        return i == nLength;
    }
}

/*
925. Long Pressed Name
 */
