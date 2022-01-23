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
    TreeNode* sortedListToBST(ListNode* head) {
        if (!head) return NULL;

        return helper(head, NULL);
    }

    TreeNode* helper(ListNode* head, ListNode* tail) {
        if (head == tail) return NULL;

        ListNode* slow = head;
        ListNode* fast = head;

        while (fast != tail && fast->next != tail) {
            slow = slow->next;
            fast = fast->next->next;
        }

        TreeNode* node = new TreeNode(slow->val);
        node->left = helper(head, slow);
        node->right = helper(slow->next, tail);

        return node;
    }
};