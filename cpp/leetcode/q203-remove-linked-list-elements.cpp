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
    ListNode* removeElements(ListNode* head, int val) {
        if (!head) return NULL;

        ListNode* pointer = head;

        while (pointer->next) {
            if (pointer->next->val == val) {
                pointer->next = pointer->next->next;
            } else {
                pointer = pointer->next;
            }
        }

        return head->val == val ? head->next : head;
    }
};