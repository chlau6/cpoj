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
            int i = c - 'a';

            if (!r->children[i]) {
                r->children[i] = new TrieNode();
            }

            r = r->children[i];
        }

        r->isWord = true;
    }

    bool search(string word) {
        TrieNode* r = root;

        for (auto c : word) {
            int i = c - 'a';

            if (!r->children[i]) {
                return false;
            }

            r = r->children[i];
        }

        return r->isWord;
    }

    bool startsWith(string prefix) {
        TrieNode* r = root;

        for (auto c : prefix) {
            int i = c - 'a';

            if (!r->children[i]) {
                return false;
            }

            r = r->children[i];
        }

        return true;
    }
};