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
    ListNode* insertionSortList(ListNode* head) {
        ListNode* dummy = new ListNode();

        while (head) {
            ListNode* curr = dummy;

            while (curr->next && curr->next->val <= head->val) {
                curr = curr->next;
            }

            ListNode* temp = head->next;
            head->next = curr->next;
            curr->next = head;
            head = temp;
        }

        return dummy->next;
    }
};