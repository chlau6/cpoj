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
        Node* node = root;
        Node* dummy = new Node(-1);
        Node* dummyHead = dummy;

        while (node) {
            if (node->left) {
                dummy->next = node->left;
                dummy = dummy->next;
            }

            if (node->right) {
                dummy->next = node->right;
                dummy = dummy->next;
            }

            node = node->next;

            if (!node) {
                node = dummyHead->next;
                dummy = dummyHead;
                dummy->next = NULL;
            }

        }


        return root;
    }
};