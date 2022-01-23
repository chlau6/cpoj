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
    ListNode* deleteDuplicates(ListNode* head) {
        if (!head || !head->next) return head;

        ListNode* dummy = new ListNode();
        dummy->next = head;
        ListNode* prev = dummy;

        while (prev->next) {
            ListNode* curr = prev->next;

            while (curr->next && curr->val == curr->next->val) {
                curr = curr->next;
            }

            if (curr != prev->next) {
                prev->next = curr->next;
            } else {
                prev = prev->next;
            }
        }

        return dummy->next;
    }
};