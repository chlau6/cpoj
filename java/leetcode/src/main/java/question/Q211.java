package question;

public class Q211 {
    /*
    Time Complexity: addWord: O(length)     search: O(n) / O(26^length)
    Space Complexity: O(word * length)
     */
    class WordDictionary {
        TrieNode root;

        /**
         * Initialize your data structure here.
         */
        public WordDictionary() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            TrieNode temp = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (temp.children[index] == null) {
                    temp.children[index] = new TrieNode();
                }
                temp = temp.children[index];
            }
            temp.isLeaf = true;
        }

        public boolean search(String word) {
            return dfs(word, 0, root);
        }

        public boolean dfs(String word, int index, TrieNode node) {
            if (index >= word.length()) return node.isLeaf;

            char c = word.charAt(index);

            if (c != '.') {
                return node.children[c - 'a'] != null && dfs(word, index + 1, node.children[c - 'a']);
            } else {
                for (int i = 0; i < 26; i++) {
                    if (node.children[i] != null && dfs(word, index + 1, node.children[i])) {
                        return true;
                    }
                }
            }
            return false;
        }

        class TrieNode {
            TrieNode[] children = new TrieNode[26];
            boolean isLeaf;
        }
    }
}
