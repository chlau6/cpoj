#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if (!head) return NULL;

        int count = 1;

        ListNode* pointer = head;

        while (pointer->next) {
            pointer = pointer->next;
            count++;
        }

        pointer->next = head;

        int loop = count - (k % count);

        for (int i = 0; i < loop; i++) {
            pointer = pointer->next;
        }

        head = pointer->next;
        pointer->next = NULL;

        return head;
    }
};