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

class Trie {
public:
    TrieNode* root;

    Trie() {
        root = new TrieNode();
    }

    void insert(string word) {
        TrieNode* r = root;

        for (auto c : word) {
            int j = c - 'a';

            if (!r->children[j]) {
                r->children[j] = new TrieNode();
            }

            r = r->children[j];
        }

        r->isWord = true;
    }

    bool search(string word) {
        TrieNode* r = root;

        for (auto c : word) {
            int j = c - 'a';

            if (!r->children[j]) {
                return false;
            }

            r = r->children[j];
        }

        return r->isWord;
    }

    bool startsWith(string prefix) {
        TrieNode* r = root;

        for (auto c : prefix) {
            int j = c - 'a';

            if (!r->children[j]) {
                return false;
            }

            r = r->children[j];
        }

        return true;
    }
};