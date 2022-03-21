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
    ListNode* oddEvenList(ListNode* head) {
        ListNode* odd = new ListNode();
        ListNode* even = new ListNode();
        ListNode* d1 = odd;
        ListNode* d2 = even;
        bool isOdd = true;

        while (head) {
            if (isOdd) {
                d1->next = head;
                d1 = d1->next;
            } else {
                d2->next = head;
                d2 = d2->next;
            }

            head = head->next;
            isOdd = !isOdd;
        }

        d2->next = NULL;
        d1->next = even->next;

        return odd->next;
    }
};