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
    bool findTarget(TreeNode* root, int k) {
        unordered_set<int> set;

        return traverse(root, set, k);
    }

    bool traverse(TreeNode* root, unordered_set<int>& set, int k) {
        if (!root) return false;

        if (set.count(k - root->val)) return true;

        set.insert(root->val);

        return traverse(root->left, set, k) || traverse(root->right, set, k);
    }
};