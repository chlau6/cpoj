#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxSumSubmatrix(vector<vector<int>>& matrix, int k) {
        int m = matrix.size();
        int n = matrix[0].size();
        int result = INT_MIN;

        for (int i = 0; i < m; i++) {
            vector<int> sums(n);

            for (int j = i; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    sums[l] += matrix[j][l];
                }

                result = max(result, maxSumSubarray(sums, k));
            }
        }

        return result;
    }

    int maxSumSubarray(vector<int>& sums, int k) {
        set<int> set = {0};
        int result = INT_MIN;
        int currentSum = 0;

        for (int s : sums) {
            currentSum += s;

            auto it = set.lower_bound(currentSum - k);

            if (it != set.end()) {
                result = max(result, currentSum - *it);
            }

            set.insert(currentSum);
        }

        return result;
    }
};