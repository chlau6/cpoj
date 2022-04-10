#include<bits/stdc++.h>

using namespace std;

class Node {
public:
    int key;
    int val;
    Node* prev;
    Node* next;

    Node(int key, int val) {
        this->key = key;
        this->val = val;
    }
};

class LRUCache {
public:
    unordered_map<int, Node*> cache;
    int maxCapacity;
    Node* head;
    Node* tail;

    LRUCache(int capacity) {
        maxCapacity = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head->prev = NULL;
        head->next = tail;
        tail->prev = head;
        tail->next = NULL;
    }

    void deleteNode(Node* node) {
        node->prev->next = node->next;
        node->next->prev = node->prev;
    }

    void add(Node* node) {
        node->next = head->next;
        head->next->prev = node;
        head->next = node;
        node->prev = head;
    }

    int get(int key) {
        if (!cache.count(key)) return -1;

        Node* node = cache[key];
        deleteNode(node);
        add(node);

        return node->val;
    }

    void put(int key, int value) {
        if (cache.count(key)) {
            Node* node = cache[key];
            node->val = value;
            deleteNode(node);
            add(node);
        } else {
            Node* newNode = new Node(key, value);
            cache[key] = newNode;
            add(newNode);
        }

        if (cache.size() > maxCapacity) {
            Node* oldNode = tail->prev;
            cache.erase(oldNode->key);
            deleteNode(oldNode);
        }
    }
};