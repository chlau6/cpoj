#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> mostVisited(int n, vector<int>& rounds) {
        vector<int> result;
        int length = rounds.size();

        for (int i = rounds[0]; i <= rounds[length - 1]; i++) {
            result.push_back(i);
        }

        if (result.size() > 0) return result;

        for (int i = 1; i <= rounds[length - 1]; i++) {
            result.push_back(i);
        }

        for (int i = rounds[0]; i <= n; i++) {
            result.push_back(i);
        }

        return result;
    }
};