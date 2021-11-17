#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int result = 0;

        for (auto account : accounts) {
            int sum = accumulate(account.begin(), account.end(), 0);
            result = max(result, sum);
        }

        return result;
    }
};