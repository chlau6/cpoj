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
    int rob(TreeNode* root) {
        vector<int> result = dfs(root);

        return max(result[0], result[1]);
    }

    vector<int> dfs(TreeNode* root) {
        if (!root) return vector<int>(2);

        vector<int> left = dfs(root->left);
        vector<int> right = dfs(root->right);
        vector<int> result(2);

        result[0] = max(left[0], left[1]) + max(right[0], right[1]);
        result[1] = root->val + left[0] + right[0];

        return result;
    }
};