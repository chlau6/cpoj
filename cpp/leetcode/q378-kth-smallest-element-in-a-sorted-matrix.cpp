#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    struct Compare {
        bool operator()(vector<int>& a, vector<int>& b) {
            return a[0] > b[0];
        }
    };

    int kthSmallest(vector<vector<int>>& matrix, int k) {
        priority_queue<vector<int>, vector<vector<int>>, Compare> pq;

        int n = matrix.size();

        for (int i = 0; i < n; i++) {
            pq.push({matrix[i][0], i, 0});
        }

        while (--k > 0) {
            vector<int> root = pq.top();
            pq.pop();

            if (root[2] + 1 == n) continue;

            int i = root[1];
            int j = root[2] + 1;

            pq.push({matrix[i][j], i, j});
        }

        return pq.top()[0];
    }
};