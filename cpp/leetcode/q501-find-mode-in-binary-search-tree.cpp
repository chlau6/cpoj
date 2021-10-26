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
    vector<int> findMode(TreeNode* root) {
        vector<int> result;
        int count = 1;
        int max = 0;
        TreeNode* prev = NULL;

        inorder(root, prev, result, count, max);

        return result;
    }

    void inorder(TreeNode* root, TreeNode*& prev, vector<int>& result, int& count, int& max) {
        if (!root) return;

        inorder(root->left, prev, result, count, max);

        if (prev) {
            count = (prev->val == root->val) ? count + 1 : 1;
        }

        if (count >= max) {
            if (count > max) result.clear();
            result.push_back(root->val);
            max = count;
        }

        prev = root;

        inorder(root->right, prev, result, count, max);
    }
};