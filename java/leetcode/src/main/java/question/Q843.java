package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q843 {
    public void findSecretWord(String[] wordlist, Master master) {
        List<String> words = Arrays.asList(wordlist);
        int match = 0;

        for (int i = 1; i <= 10; i++) {
            int random = (int) (Math.random() * words.size());
            String w = words.get(random);

            int matches = master.guess(w);

            if (match == 6) return;

            List<String> updatedList = new ArrayList<>();

            for (String newWord : words) {
                if (similarity(w, newWord) == matches) {
                    updatedList.add(newWord);
                }
            }

            words = updatedList;
        }
    }

    public int similarity(String a, String b) {
        int similarity = 0;

        for (int i = 0; i < 6; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                similarity++;
            }
        }

        return similarity;
    }

    class Master {
        public int guess(String word) {
            return 0;
        }
    }
}

/*
2160. Minimum Sum of Four Digit Number After Splitting Digits
 */
