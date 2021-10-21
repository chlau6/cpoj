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
    bool isPalindrome(ListNode* head) {
        if (!head || !head->next) return true;

        ListNode* slow = head;
        ListNode* fast = head;

        while (fast->next && fast->next->next) {
            slow = slow->next;
            fast = fast->next->next;
        }

        ListNode* prev = slow->next;

        while (prev->next) {
            ListNode* temp = prev->next;
            prev->next = temp->next;
            temp->next = slow->next;
            slow->next = temp;
        }

        slow = slow->next;

        while (slow) {
            if (slow->val != head->val) return false;
            slow = slow->next;
            head = head->next;
        }

        return true;
    }
};