#include<bits/stdc++.h>

using namespace std;

class TrieNode {
public:
    vector<TrieNode*> children;
    bool isWord = false;

    TrieNode() {
        children.resize(26);
    }
};

class WordDictionary {
public:
    TrieNode* root = new TrieNode();

    WordDictionary() {

    }

    void addWord(string word) {
        TrieNode* r = root;

        for (auto& c : word) {
            int j = c - 'a';

            if (!r->children[j]) {
                r->children[j] = new TrieNode();
            }

            r = r->children[j];
        }

        r->isWord = true;
    }

    bool search(string word) {
        return search(root, word, 0);
    }

    bool search(TrieNode* node, string word, int i) {
        if (i == word.length()) return node->isWord;

        char c = word[i];

        if (c != '.') {
            return node->children[c - 'a'] && search(node->children[c - 'a'], word, i + 1);
        }

        for (auto& child : node->children) {
            if (child && search(child, word, i + 1)) return true;
        }

        return false;
    }
};
