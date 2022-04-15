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
        string s = "";

        serialize(root, s);

        return s;
    }

    void serialize(TreeNode* root, string& s) {
        if (!root) return;

        s += to_string(root->val) + " ";
        serialize(root->left, s);
        serialize(root->right, s);
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
        queue<string> queue;
        istringstream iss(data);

        string token;
        while (iss >> token) {
            queue.push(token);
        }

        return deserialize(queue, INT_MIN, INT_MAX);
    }

    TreeNode* deserialize(queue<string>& queue, int lower, int upper) {
        if (queue.empty()) return NULL;

        string s = queue.front();
        int value = stoi(s);

        if (value < lower || value > upper) return NULL;

        queue.pop();

        TreeNode* root = new TreeNode(value);
        root->left = deserialize(queue, lower, value);
        root->right = deserialize(queue, value, upper);

        return root;
    }
};