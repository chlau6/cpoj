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
    int pairSum(ListNode* head) {
        int result = 0;
        ListNode* slow = head;
        ListNode* fast = head;

        while (fast->next && fast->next->next) {
            slow = slow->next;
            fast = fast->next->next;
        }

        slow = reverse(slow->next);
        fast = head;

        while (slow) {
            result = max(result, slow->val + fast->val);
            slow = slow->next;
            fast = fast->next;
        }

        return result;
    }

    ListNode* reverse(ListNode* node) {
        ListNode* prev = NULL;

        while (node) {
            ListNode* next = node->next;
            node->next = prev;
            prev = node;
            node = next;
        }

        return prev;
    }
};