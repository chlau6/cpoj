package question;

import java.util.HashMap;
import java.util.Map;

public class Q488 {
    public int findMinStep(String board, String hand) {
        int[] counts = new int[26];
        Map<String, Integer> map = new HashMap<>();

        for (char c : hand.toCharArray()) {
            counts[c - 'A']++;
        }

        return dfs(map, counts, board);
    }

    public int dfs(Map<String, Integer> map, int[] counts, String board) {
        if (board.isEmpty()) return 0;

        String key = board + "#" + serialize(counts);
        if (map.containsKey(key)) return map.get(key);

        int result = Integer.MAX_VALUE;
        int m = board.length();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 26; j++) {
                boolean trying = board.charAt(i) - 'A' == j || i > 0 && board.charAt(i) == board.charAt(i - 1) && board.charAt(i) - 'A' != j;

                if (counts[j] > 0 && trying) {
                    counts[j]--;

                    String newBoard = updateBoard(board.substring(0, i) + (char) ('A' + j) + board.substring(i));
                    int steps = dfs(map, counts, newBoard);
                    if (steps >= 0) {
                        result = Math.min(result, steps + 1);
                    }

                    counts[j]++;
                }
            }
        }

        if (result == Integer.MAX_VALUE) {
            result = -1;
        }

        map.put(key, result);
        return result;
    }

    public String updateBoard(String board) {
        int m = board.length();

        for (int i = 0, j = 0; i < m; j++) {
            while (i < m && board.charAt(i) == board.charAt(j)) {
                i++;
            }

            if (i - j >= 3) {
                return updateBoard(board.substring(0, j) + board.substring(i));
            }
        }

        return board;
    }

    private String serialize(int[] counts) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                builder.append((char) ('A' + i)).append(counts[i]);
            }
        }

        return builder.toString();
    }
}

/*
488. Zuma Game
 */
