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
    TreeNode* balanceBST(TreeNode* root) {
        vector<TreeNode*> list;

        inorder(list, root);

        return construct(list, 0, list.size() - 1);
    }

    void inorder(vector<TreeNode*>& list, TreeNode* root) {
        if (!root) return;

        inorder(list, root->left);

        list.push_back(root);

        inorder(list, root->right);
    }

    TreeNode* construct(vector<TreeNode*>& list, int i, int j) {
        if (i > j) return NULL;

        int mid = (i + j) / 2;

        TreeNode* node = list[mid];
        node->left = construct(list, i, mid - 1);
        node->right = construct(list, mid + 1, j);

        return node;
    }
};