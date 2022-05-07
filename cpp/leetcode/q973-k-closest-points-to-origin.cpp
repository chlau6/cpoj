#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    struct Compare {
        bool operator()(vector<int>& a, vector<int>& b) {
            return a[0] * a[0] + a[1] * a[1] > b[0] * b[0] + b[1] * b[1];
        }
    };

    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        priority_queue<vector<int>, vector<vector<int>>, Compare> pq;

        for (auto& point : points) {
            pq.push(point);
        }

        vector<vector<int>> result(k);

        for (int i = 0; i < k; i++) {
            result[i] = pq.top();
            pq.pop();
        }

        return result;
    }
};