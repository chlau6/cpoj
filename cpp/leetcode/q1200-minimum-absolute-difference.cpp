#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
        int diff = INT_MAX;
        int length = arr.size();

        sort(arr.begin(), arr.end());

        vector<vector<int>> result;

        for (int i = 0; i < length - 1; i++) {
            int tempDiff = arr[i + 1] - arr[i];

            if (tempDiff <= diff) {
                if (tempDiff < diff) {
                    result.clear();
                }
                result.push_back({arr[i], arr[i + 1]});
                diff = tempDiff;
            }
        }

        return result;
    }
};