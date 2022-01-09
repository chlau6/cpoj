package question;

import java.util.ArrayList;
import java.util.List;

public class Q68 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(mn)
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        int n = words.length;
        int i = 0;
        int j = 0;

        while (i < n) {
            int len = 0;

            while (j < words.length && len + words[j].length() + j - i <= maxWidth) {
                len += words[j++].length();
            }

            StringBuilder lines = new StringBuilder(words[i]);

            int space = 1;
            int extra = 0;

            if (j != i + 1 && j != n) {
                space = (maxWidth - len) / (j - i - 1);
                extra = (maxWidth - len) % (j - i - 1);
            }

            String spaceStr = " ".repeat(space);

            for (int k = i + 1; k < j; k++) {
                lines.append(spaceStr);
                if (extra-- > 0) lines.append(' ');
                lines.append(words[k]);
            }

            int lastLineSpace = maxWidth - lines.length();
            lines.append(" ".repeat(lastLineSpace));
            result.add(lines.toString());

            i = j;
        }

        return result;
    }
}

/*
68. Text Justification
 */
