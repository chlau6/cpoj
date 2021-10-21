#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minCost = INT_MAX;
        int maxProfit = 0;

        for (int price : prices) {
            minCost = min(minCost, price);
            maxProfit = max(maxProfit, price - minCost);
        }

        return maxProfit;
    }
};