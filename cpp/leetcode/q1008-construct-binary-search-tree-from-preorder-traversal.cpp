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
    int i = 0;

    TreeNode* bstFromPreorder(vector<int>& preorder) {
        return dfs(preorder, INT_MAX);
    }

    TreeNode* dfs(vector<int>& preorder, int bound) {
        if (i >= preorder.size() || preorder[i] >= bound) return NULL;

        TreeNode* node = new TreeNode(preorder[i++]);
        node->left = dfs(preorder, node->val);
        node->right = dfs(preorder, bound);

        return node;
    }
};