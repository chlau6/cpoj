package question;

public class Q208 {
    class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
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
            TrieNode r = root;

            for (char c : word.toCharArray()) {
                int j = c - 'a';

                if (r.children[j] == null) {
                    return false;
                }

                r = r.children[j];
            }

            return r.isWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode r = root;

            for (char c : prefix.toCharArray()) {
                int j = c - 'a';

                if (r.children[j] == null) {
                    return false;
                }

                r = r.children[j];
            }

            return true;
        }
    }

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }
}

/*
208. Implement Trie (Prefix Tree)
 */
