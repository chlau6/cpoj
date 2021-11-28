#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int timeRequiredToBuy(vector<int>& tickets, int k) {
        int result = 0;
        int n = tickets.size();

        for (int i = 0; i < n; i++) {
            result += min(tickets[k] - (i > k ? 1 : 0), tickets[i]);
        }

        return result;
    }
};