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
    ListNode* swapNodes(ListNode* head, int k) {
        ListNode* slow = head;
        ListNode* fast = head;
        ListNode* first = NULL;
        ListNode* second = NULL;

        for (int i = 0; i < k - 1; i++) {
            fast = fast->next;
        }

        first = fast;

        while (fast->next) {
            slow = slow->next;
            fast = fast->next;
        }

        second = slow;

        swap(first->val, second->val);

        return head;
    }
};