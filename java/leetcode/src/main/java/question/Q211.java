package question;

public class Q211 {
    class WordDictionary {
        TrieNode root = new TrieNode();

        public WordDictionary() {

        }

        public void addWord(String word) {
            TrieNode r = root;

            for (char c : word.toCharArray()) {
                int j = c - 'a';

                if (r.children[j] == null) {
                    r.children[j] = new TrieNode();
                }

                r = r.children[j];
            }

            r.isWord = true;
        }

        public boolean search(String word) {
            return search(root, word, 0);
        }

        public boolean search(TrieNode node, String word, int i) {
            if (i == word.length()) return node.isWord;

            char c = word.charAt(i);

            if (c != '.') {
                return (node.children[c - 'a'] != null && search(node.children[c - 'a'], word, i + 1));
            }

            for (TrieNode child : node.children) {
                if (child != null && search(child, word, i + 1)) return true;
            }

            return false;
        }
    }

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }
}
