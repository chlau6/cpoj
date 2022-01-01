package question;

import java.util.Map;

public class Q13 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int value = 0;
        int length = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < length - 1; i++) {
            int curr = map.get(chars[i]);
            int next = map.get(chars[i + 1]);

            if (curr < next) {
                value -= curr;
            } else {
                value += curr;
            }
        }

        value += map.get(chars[length - 1]);

        return value;
    }
}

/*
13. Roman to Integer
 */
