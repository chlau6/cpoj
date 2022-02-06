#include<bits/stdc++.h>

using namespace std;

class Node {
public:
    int val;
    Node* next;
    Node* random;

    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};

class Solution {
public:
    Node* copyRandomList(Node* head) {
        Node* dummy = head;

        unordered_map<Node*, Node*> map;

        while (dummy) {
            map[dummy] = new Node(dummy->val);
            dummy = dummy->next;
        }

        dummy = head;

        while (dummy) {
            Node* node = map[dummy];
            node->next = map[dummy->next];
            node->random = map[dummy->random];
            dummy = dummy->next;
        }

        return map[head];
    }
};