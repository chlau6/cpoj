#include<bits/stdc++.h>

using namespace std;

class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
public:
    vector<vector<int>> levelOrder(Node* root) {
        vector<vector<int>> result;

        if (!root) return result;

        queue<Node*> q;
        q.push(root);

        while (!q.empty()) {
            int n = q.size();
            vector<int> currentLevel;

            for (int i = 0; i < n; i++) {
                Node* parent = q.front();
                q.pop();

                currentLevel.push_back(parent->val);

                for (auto& child : parent->children) {
                    q.push(child);
                }
            }

            result.push_back(currentLevel);
        }

        return result;
    }
};