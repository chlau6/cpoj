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
                int i = c - 'a';

                if (r.children[i] == null) {
                    r.children[i] = new TrieNode();
                }

                r = r.children[i];

            }

            r.isWord = true;
        }

        public boolean search(String word) {
            TrieNode r = root;

            for (char c : word.toCharArray()) {
                int i = c - 'a';

                if (r.children[i] == null) {
                    return false;
                }

                r = r.children[i];
            }

            return r.isWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode r = root;

            for (char c : prefix.toCharArray()) {
                int i = c - 'a';

                if (r.children[i] == null) {
                    return false;
                }

                r = r.children[i];
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
