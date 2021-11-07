#include<bits/stdc++.h>

using namespace std;

class Comparator {
public:
    bool operator() (pair<int, int>& a, pair<int, int>& b) {
        if (a.first == b.first) {
            return a.second < b.second;
        } else {
            return a.first < b.first;
        }
    }
};

class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        int length = mat.size();
        priority_queue<pair<int, int>, vector<pair<int, int>>, Comparator> pq;

        for (int i = 0; i < length; i++) {
            pq.push({numOfOnes(mat[i]), i});

            if (pq.size() > k) {
                pq.pop();
            }
        }

        vector<int> result;

        while (!pq.empty()) {
            result.push_back(pq.top().second);
            pq.pop();
        }

        reverse(result.begin(), result.end());

        return result;
    }

    int numOfOnes(vector<int>& row) {
        int left = 0;
        int right = row.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
};