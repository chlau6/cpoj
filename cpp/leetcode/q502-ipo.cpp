#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findMaximizedCapital(int k, int w, vector<int>& profits, vector<int>& capital) {
        priority_queue<pair<int, int>> maxHeap;
        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> minHeap;

        int n = profits.size();

        for (int i = 0; i < n; i++) {
            minHeap.push({capital[i], profits[i]});
        }

        for (int i = 0; i < k; i++) {
            while (!minHeap.empty() && minHeap.top().first <= w) {
                auto top = minHeap.top();
                minHeap.pop();

                maxHeap.push({top.second, top.first});
            }

            if (maxHeap.empty()) break;

            auto top = maxHeap.top();
            maxHeap.pop();

            w += top.first;
        }

        return w;
    }
};