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
    int maxDepth(Node* root) {
        if (!root) return 0;

        int depth = 0;
        queue<Node*> q;
        q.push(root);

        while (!q.empty()) {
            int size = q.size();
            depth++;

            for (int i = 0; i < size; i++) {
                Node* node = q.front();
                q.pop();

                for (auto child : node->children) {
                    q.push(child);
                }
            }
        }

        return depth;
    }
};