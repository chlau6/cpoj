#include<bits/stdc++.h>

using namespace std;

class Node {
public:
    int val;
    vector<Node*> neighbors;
    Node() {
        val = 0;
        neighbors = vector<Node*>();
    }
    Node(int _val) {
        val = _val;
        neighbors = vector<Node*>();
    }
    Node(int _val, vector<Node*> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};

class Solution {
public:
    Node* cloneGraph(Node* node) {
        unordered_map<Node*, Node*> map;

        return dfs(map, node);
    }

    Node* dfs(unordered_map<Node*, Node*>& map, Node* node) {
        if (!node) return NULL;

        if (map.count(node)) return map[node];

        Node* newNode = new Node(node->val);
        map[node] = newNode;

        for (auto neighbor : node->neighbors) {
            newNode->neighbors.push_back(dfs(map, neighbor));
        }

        return newNode;
    }
};