package question;

import java.util.ArrayList;
import java.util.List;

public class Q500 {
    public String[] findWords(String[] words) {
        int[] map = new int[] {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};

        List<String> list = new ArrayList<>();

        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            int row = map[chars[0] - 'a'];
            int length = chars.length;
            int i;

            for (i = 1; i < length; i++) {
                if (map[chars[i] - 'a'] != row) {
                    break;
                }
            }

            if (i == length) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}

/*
500. Keyboard Row
 */
