package question;

import java.util.ArrayList;
import java.util.List;

public class Q1078 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(n)
     */
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();

        String[] words = text.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second) && i + 2 < words.length) {
                list.add(words[i + 2]);
            }
        }

        return list.toArray(new String[0]);
    }
}

/*
1078. Occurrences After Bigram
 */
