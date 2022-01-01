package question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q859 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public boolean buddyStrings(String s, String goal) {
        int length = s.length();

        if (length != goal.length()) return false;

        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < length; i++) {
                set.add(s.charAt(i));
            }

            return set.size() < length;
        }

        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                index.add(i);
            }
        }

        return index.size() == 2 && s.charAt(index.get(0)) == goal.charAt(index.get(1)) && s.charAt(index.get(1)) == goal.charAt(index.get(0));
    }
}

/*
859. Buddy Strings
 */
