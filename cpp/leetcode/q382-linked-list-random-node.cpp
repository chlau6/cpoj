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
    vector<ListNode*> v;

    Solution(ListNode* head) {
        while (head) {
            v.push_back(head);
            head = head->next;
        }
    }

    int getRandom() {
        return v[rand() % v.size()]->val;
    }
};
