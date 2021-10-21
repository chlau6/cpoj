#include<bits/stdc++.h>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
public:
    vector<string> binaryTreePaths(TreeNode* root) {
        if (!root) return {};

        vector<string> v;

        helper(root, v, "");

        return v;
    }

    void helper(TreeNode* root, vector<string>& v, string path) {
        if (!root->left && !root->right) {
            v.push_back(path + to_string(root->val));
        }

        string newPath = path + to_string(root->val) + "->";

        if (root->left) helper(root->left, v, newPath);

        if (root->right) helper(root->right, v, newPath);
    }
};