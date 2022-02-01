package question;

import java.util.*;

public class Q126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        Queue<List<String>> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        Set<String> words = new HashSet<>();

        queue.add(List.of(beginWord));

        int level = 1;
        int minLevel = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            List<String> path = queue.remove();

            if (path.size() > level) {
                for (String w : words) {
                    set.remove(w);
                }
                words.clear();
                level = path.size();

                if (level > minLevel) break;
            }

            String lastWord = path.get(path.size() - 1);
            int n = lastWord.length();

            for (int i = 0; i < n; i++) {
                char[] nextWord = lastWord.toCharArray();

                for (char c = 'a'; c <= 'z'; c++) {
                    nextWord[i] = c;

                    String str = String.valueOf(nextWord);

                    if (!set.contains(str)) continue;

                    words.add(str);

                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(str);

                    if (str.equals(endWord)) {
                        result.add(newPath);
                        minLevel = newPath.size();
                    } else {
                        queue.add(newPath);
                    }
                }
            }
        }

        return result;
    }
}
/*
126. Word Ladder II
 */