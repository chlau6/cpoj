package question;

import java.util.ArrayList;
import java.util.List;

public class Q1790 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> index = new ArrayList<>();
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                index.add(i);
            }
        }

        int size = index.size();

        if (size == 0) return true;
        else if (size != 2) return false;

        int i1 = index.get(0);
        int i2 = index.get(1);

        return s1.charAt(i1) == s2.charAt(i2) && s1.charAt(i2) == s2.charAt(i1);
    }
}

/*
1790. Check if One String Swap Can Make Strings Equal
 */
