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
    void reorderList(ListNode* head) {
        if (!head || !head->next) return;

        ListNode* slow = head;
        ListNode* fast = head;

        while (fast->next && fast->next->next) {
            slow = slow->next;
            fast = fast->next->next;
        }

        ListNode* mid = slow->next;
        ListNode* prev = NULL;
        slow->next = NULL;

        while (mid) {
            ListNode* temp = mid->next;
            mid->next = prev;
            prev = mid;
            mid = temp;
        }

        while (head && prev) {
            ListNode* next = head->next;
            head->next = prev;
            prev = prev->next;
            head->next->next = next;
            head = next;
        }
    }
};