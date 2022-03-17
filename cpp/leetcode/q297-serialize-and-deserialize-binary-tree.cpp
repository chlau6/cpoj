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

class Codec {
public:

    // Encodes a tree to a single string.
    string serialize(TreeNode* root) {
        if (!root) return "#";

        return to_string(root->val) + " " + serialize(root->left) + " " + serialize(root->right);
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
        queue<string> queue;
        istringstream iss(data);
        string token;

        while (iss >> token) {
            queue.push(token);
        }

        return helper(queue);
    }

    TreeNode* helper(queue<string>& queue) {
        if (queue.front() == "#") {
            queue.pop();
            return NULL;
        }

        int value = stoi(queue.front());
        queue.pop();

        TreeNode* root = new TreeNode(value);
        root->left = helper(queue);
        root->right = helper(queue);

        return root;
    }
};