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
    vector<int> postorder(Node* root) {
        vector<int> v;

        postorder(root, v);

        return v;
    }

    void postorder(Node* root, vector<int>& v) {
        if (!root) return;

        for (auto child : root->children) {
            postorder(child, v);
        }

        v.push_back(root->val);
    }
};