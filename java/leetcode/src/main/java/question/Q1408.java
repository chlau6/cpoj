package question;

import java.util.ArrayList;
import java.util.List;

public class Q1408 {
    public List<String> stringMatching(String[] words) {
        String combined = String.join(" ", words);

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (combined.indexOf(word) != combined.lastIndexOf(word)) {
                result.add(word);
            }
        }

        return result;
    }
}

/*
1408. String Matching in an Array
 */
