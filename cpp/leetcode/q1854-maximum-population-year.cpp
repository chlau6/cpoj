#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maximumPopulation(vector<vector<int>>& logs) {
        vector<int> count(2051);
        int result = 0;

        for (auto log : logs) {
            count[log[0]]++;
            count[log[1]]--;
        }

        for (int i = 1950; i < 2051; i++) {
            count[i] += count[i - 1];
            result = count[i] > count[result] ? i : result;
        }

        return result;
    }
};