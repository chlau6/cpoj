#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        stack<int> stack;
        int length = prices.size();

        for (int i = 0; i < length; i++) {
            while (!stack.empty() && prices[stack.top()] >= prices[i]) {
                prices[stack.top()] -= prices[i];
                stack.pop();
            }

            stack.push(i);
        }

        return prices;
    }
};