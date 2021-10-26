package question;

import annotation.Array;
import annotation.HashTable;
import annotation.Strings;

import java.util.ArrayList;
import java.util.List;

@Array
@HashTable
@Strings
public class Q500 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(n)
     */
    public String[] findWords(String[] words) {
        int[] map = new int[] {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};

        List<String> list = new ArrayList<>();

        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();

            int row = map[chars[0] - 'a'];

            int i;
            for (i = 1; i < chars.length; i++) {
                if (map[chars[i] - 'a'] != row) {
                    break;
                }
            }

            if (i == chars.length) {
                list.add(word);
            }
        }

        String[] result = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

/*
500. Keyboard Row
 */
