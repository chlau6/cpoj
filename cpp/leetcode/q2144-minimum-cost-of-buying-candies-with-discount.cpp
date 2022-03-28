#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minimumCost(vector<int>& cost) {
        sort(cost.begin(), cost.end());

        int n = cost.size();
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (i % 3 != n % 3) {
                result += cost[i];
            }
        }

        return result;
    }
};