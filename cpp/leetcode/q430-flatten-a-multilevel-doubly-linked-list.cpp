#include<bits/stdc++.h>

using namespace std;

class Node {
public:
    int val;
    Node* prev;
    Node* next;
    Node* child;
};

class Solution {
public:
    Node* flatten(Node* head) {
        Node* curr = head;

        while (curr) {
            if (curr->child) {
                Node* next = curr->next;
                Node* child = curr->child;

                while (child->next) {
                    child = child->next;
                }

                curr->next = curr->child;
                curr->next->prev = curr;
                curr->child = NULL;
                child->next = next;

                if (next) {
                    next->prev = child;
                }
            }

            curr = curr->next;
        }

        return head;
    }
};