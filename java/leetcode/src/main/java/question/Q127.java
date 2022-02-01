package question;

import java.util.*;

public class Q127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;

        int result = 1;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        while (!queue.isEmpty()) {
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                String lastWord = queue.remove();
                int m = lastWord.length();

                if (lastWord.equals(endWord)) return result;

                for (int j = 0; j < m; j++) {
                    char[] nextWord = lastWord.toCharArray();

                    for (char c = 'a'; c <= 'z'; c++) {
                        nextWord[j] = c;

                        String str = String.valueOf(nextWord);

                        if (set.contains(str)) {
                            queue.add(str);
                            set.remove(str);
                        }
                    }
                }
            }

            result++;
        }

        return 0;
    }
}
/*
127. Word Ladder
 */