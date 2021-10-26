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
    int findTilt(TreeNode* root) {
        int sum = 0;

        postorder(root, sum);

        return sum;
    }

    int postorder(TreeNode* root, int& sum) {
        if (!root) return 0;

        int left = postorder(root->left, sum);
        int right = postorder(root->right, sum);

        sum += abs(left - right);

        return root->val + left + right;
    }
};