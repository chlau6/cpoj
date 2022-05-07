#include<bits/stdc++.h>

using namespace std;

struct MaxHeap {
    bool operator()(pair<int, string>& a, pair<int, string>& b) {
        return a.first == b.first ? a.second > b.second : a.first < b.first;
    }
};

struct MinHeap {
    bool operator()(pair<int, string>& a, pair<int, string>& b) {
        return a.first == b.first ? a.second < b.second : a.first > b.first;
    }
};

class SORTracker {
public:
    priority_queue<pair<int, string>, vector<pair<int, string>>, MinHeap> minHeap;
    priority_queue<pair<int, string>, vector<pair<int, string>>, MaxHeap> maxHeap;
    int count = 0;

    SORTracker() {

    }

    void add(string name, int score) {
        minHeap.push({score, name});

        if (minHeap.size() > count) {
            maxHeap.push(minHeap.top());
            minHeap.pop();
        }
    }

    string get() {
        minHeap.push(maxHeap.top());
        maxHeap.pop();

        count++;
        return minHeap.top().second;
    }
};