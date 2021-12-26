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
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* tail = head;
        int count = 0;

        while (tail && count != k) {
            tail = tail->next;
            count++;
        }

        if (count != k) return head;

        tail = reverseKGroup(tail, k);

        while (--count >= 0) {
            ListNode* temp = head->next;
            head->next = tail;
            tail = head;
            head = temp;
        }

        return tail;
    }
};