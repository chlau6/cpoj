#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minCostToMoveChips(vector<int>& position) {
        int odd = 0;
        int even = 0;

        for (int pos : position) {
            if (pos % 2 == 0) even++;
            else odd++;
        }

        return min(odd, even);
    }
};