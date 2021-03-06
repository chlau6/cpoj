#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isSelfCrossing(vector<int>& distance) {
        int n = distance.size();
        for (int i = 3; i < n; i++) {
            if (distance[i - 3] >= distance[i - 1] && distance[i] >= distance[i - 2]) return true;

            if (i >= 4 && distance[i - 1] == distance[i - 3] && distance[i] >= (distance[i - 2] - distance[i - 4])) return true;

            if (i >= 5 && distance[i - 2] >= distance[i - 4] && distance[i - 3] >= distance[i - 1] && distance[i] >= (distance[i - 2] - distance[i - 4]) && distance[i - 1] >= (distance[i - 3] - distance[i - 5])) return true;
        }

        return false;
    }
};