#include<bits/stdc++.h>

using namespace std;

class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int val) {
        this->val = val;
    }

    Node(int val, vector<Node*> children) {
        this->val = val;
        this->children = children;
    }
};

class Solution {
public:
    vector<int> preorder(Node* root) {
        vector<int> v;

        preorder(root, v);

        return v;
    }

    void preorder(Node* root, vector<int>& vector) {
        if (!root) return;

        vector.push_back(root->val);

        for (auto child : root->children) {
            preorder(child, vector);
        }
    }
};