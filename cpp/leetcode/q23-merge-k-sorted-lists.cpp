#include<bits/stdc++.h>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        if (lists.size() == 0) return NULL;

        return partition(lists, 0, lists.size() - 1);
    }

    ListNode* partition(vector<ListNode*>& lists, int left, int right) {
        if (left >= right) return lists[left];

        int mid = left + (right - left) / 2;

        ListNode* leftNode = partition(lists, left, mid);
        ListNode* rightNode = partition(lists, mid + 1, right);

        return merge(leftNode, rightNode);
    }

    ListNode* merge(ListNode* left, ListNode* right) {
        if (!left) return right;
        if (!right) return left;

        if (left->val <= right->val) {
            left->next = merge(left->next, right);
            return left;
        } else {
            right->next = merge(left, right->next);
            return right;
        }
    }
};