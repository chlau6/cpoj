package question;

import java.util.ArrayList;
import java.util.List;

public class Q213 {
    TrieNode root = new TrieNode();

    public void construct(String word) {
        TrieNode r = root;

        for (char c : word.toCharArray()) {
            int i = c - 'a';

            if (r.children[i] == null) {
                r.children[i] = new TrieNode();
            }

            r = r.children[i];
        }

        r.word = word;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];

        for (String word : words) {
            construct(word);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                search(root, result, board, visited, i, j);
            }
        }

        return result;
    }

    public void search(TrieNode node, List<String> result, char[][] board, boolean[][] visited, int i, int j) {
        if (node == null) return;

        if (node.word != null) {
            result.add(node.word);
            node.word = null;
        }

        int m = board.length;
        int n = board[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j]) return;

        int k = board[i][j] - 'a';

        visited[i][j] = true;

        search(node.children[k], result, board, visited, i - 1, j);
        search(node.children[k], result, board, visited, i + 1, j);
        search(node.children[k], result, board, visited, i, j - 1);
        search(node.children[k], result, board, visited, i, j + 1);

        visited[i][j] = false;
    }

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }
}

/*
213. House Robber II
 */