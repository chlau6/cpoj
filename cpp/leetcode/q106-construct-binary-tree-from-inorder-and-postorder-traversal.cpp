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
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        unordered_map<int, int> map;
        int n = inorder.size();

        for (int i = 0; i < n; i++) {
            map[inorder[i]] = i;
        }

        return recursion(map, inorder, postorder, n - 1, 0, n - 1);
    }

    TreeNode* recursion(unordered_map<int, int>& map, vector<int>& inorder, vector<int>& postorder, int post, int inStart, int inEnd) {
        if (inStart > inEnd) return NULL;

        int in = map[postorder[post]];

        TreeNode* root = new TreeNode(postorder[post]);
        root->left = recursion(map, inorder, postorder, post - (inEnd - in) - 1, inStart, in - 1);
        root->right = recursion(map, inorder, postorder, post - 1, in + 1, inEnd);

        return root;
    }
};