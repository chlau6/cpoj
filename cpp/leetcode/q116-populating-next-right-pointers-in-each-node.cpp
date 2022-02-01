#include<bits/stdc++.h>

using namespace std;

class Node {
public:
    int val;
    Node* left;
    Node* right;
    Node* next;

    Node() : val(0), left(NULL), right(NULL), next(NULL) {}

    Node(int _val) : val(_val), left(NULL), right(NULL), next(NULL) {}

    Node(int _val, Node* _left, Node* _right, Node* _next)
        : val(_val), left(_left), right(_right), next(_next) {}
};

class Solution {
public:
    Node* connect(Node* root) {
        if (!root) return NULL;

        Node* node = root;

        while (node->left) {
            Node* parent = node;

            while (parent) {
                parent->left->next = parent->right;

                if (parent->next) {
                    parent->right->next = parent->next->left;
                }

                parent = parent->next;
            }

            node = node->left;
        }

        return root;
    }
};