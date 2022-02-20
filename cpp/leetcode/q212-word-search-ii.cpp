#include<bits/stdc++.h>

using namespace std;

class TrieNode {
public:
    vector<TrieNode*> children;
    string word;

    TrieNode() {
        children.resize(26);
    }
};

class Solution {
public:
    TrieNode* root = new TrieNode();

    void construct(string word) {
        TrieNode* r = root;

        for (char& c : word) {
            int i = c - 'a';

            if (!r->children[i]) {
                r->children[i] = new TrieNode();
            }

            r = r->children[i];
        }

        r->word = word;
    }

    vector<string> findWords(vector<vector<char>>& board, vector<string>& words) {
        vector<string> result;

        int m = board.size();
        int n = board[0].size();

        vector<vector<bool>> visited(m, vector<bool>(n));

        for (auto& word : words) {
            construct(word);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                search(root, result, board, visited, i, j);
            }
        }

        return result;
    }

    void search(TrieNode* node, vector<string>& result, vector<vector<char>>& board, vector<vector<bool>>& visited, int i, int j) {
        if (!node) return;

        if (!node->word.empty()) {
            result.push_back(node->word);
            node->word.clear();
        }

        int m = board.size();
        int n = board[0].size();

        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j]) return;

        int k = board[i][j] - 'a';

        visited[i][j] = true;

        search(node->children[k], result, board, visited, i - 1, j);
        search(node->children[k], result, board, visited, i + 1, j);
        search(node->children[k], result, board, visited, i, j - 1);
        search(node->children[k], result, board, visited, i, j + 1);

        visited[i][j] = false;
    }
};