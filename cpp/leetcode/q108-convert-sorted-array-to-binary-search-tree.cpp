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
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return helper(nums, 0, nums.size() - 1);
    }

    TreeNode* helper(vector<int>& nums, int start, int end) {
        if (start > end) return NULL;

        int mid = start + (end - start) / 2;

        TreeNode* node = new TreeNode(nums[mid]);
        node->left = helper(nums, start, mid - 1);
        node->right = helper(nums, mid + 1, end);

        return node;
    }
};