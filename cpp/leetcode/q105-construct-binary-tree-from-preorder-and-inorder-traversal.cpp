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
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        unordered_map<int, int> map;
        int n = inorder.size();

        for (int i = 0; i < n; i++) {
            map[inorder[i]] = i;
        }

        return recursion(map, preorder, inorder, 0, 0, n - 1);
    }

    TreeNode* recursion(unordered_map<int, int>& map, vector<int>& preorder, vector<int>& inorder, int pre, int inStart, int inEnd) {
        if (inStart > inEnd) return NULL;

        int in = map[preorder[pre]];

        TreeNode* root = new TreeNode(preorder[pre]);
        root->left = recursion(map, preorder, inorder, pre + 1, inStart, in - 1);
        root->right = recursion(map, preorder, inorder, pre + in - inStart + 1, in + 1, inEnd);

        return root;
    }
};